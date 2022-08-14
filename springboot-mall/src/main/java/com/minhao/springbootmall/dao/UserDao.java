package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
