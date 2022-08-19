package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.dto.OrderQueryParams;
import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.Order;
import com.minhao.springbootmall.model.User;

import java.util.List;

public interface UserDao {

    User getUserByEmail(String email);

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);

    Boolean updatePassword(Integer userId, String password);
}
