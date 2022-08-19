package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.CreateOrderRequest;
import com.minhao.springbootmall.dto.OrderQueryParams;
import com.minhao.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
