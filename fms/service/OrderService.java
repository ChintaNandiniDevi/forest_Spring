package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Orders;

public interface OrderService {
Orders getOrder(String orderNumber);//String
Orders addOrder(Orders orders);//Orders
Orders updateOrder(Orders orders);//Orders
Orders deleteOrder(String orderNumber);//String
List<Orders> getAllOrders();

}
