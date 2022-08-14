package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
