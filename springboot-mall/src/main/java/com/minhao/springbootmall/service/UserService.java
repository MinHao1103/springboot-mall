package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.UserLoginRequest;
import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.User;

public interface UserService {

    User login(UserLoginRequest userLoginRequest);

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
