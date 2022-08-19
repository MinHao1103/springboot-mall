package com.minhao.springbootmall.service.impl;

import com.minhao.springbootmall.dao.UserDao;
import com.minhao.springbootmall.dto.UserLoginRequest;
import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.User;
import com.minhao.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import static com.minhao.springbootmall.util.Sha2.getSHA256;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Transactional
    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        // 檢查註冊的 Email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());

        if (user != null) {
            log.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail()); // 用大括號表示變數
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        // 創建帳號
        Integer userId = userDao.createUser(userRegisterRequest);

        // 密碼加鹽後，再使用 SHA256 生成密碼雜湊值
        String hashedPassword = getSHA256(userRegisterRequest.getPassword(), userId);

        // 將雜湊後的密碼重新存進資料庫
        Boolean boo = userDao.updatePassword(userId, hashedPassword);

        if (boo == true) {
            return userId;
        } else {
            return -1;
        }
    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {

        User user = userDao.getUserByEmail(userLoginRequest.getEmail());

        // 檢查 User 是否存在
        if (user == null){
            log.warn("該 email {} 尚未註冊", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        // 使用 SHA256 生成密碼雜湊值
        String hashedPassword = getSHA256(userLoginRequest.getPassword(), user.getUserId());

        // 比較密碼
        if(user.getPassword().equals(hashedPassword)){
            return user;
        }else{
            log.warn("email {} 的密碼不正確", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
}
