package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.CreateOrderRequest;
import com.minhao.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
