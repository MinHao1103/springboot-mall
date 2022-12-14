package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.dto.OrderQueryParams;
import com.minhao.springbootmall.model.Order;
import com.minhao.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrders(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
