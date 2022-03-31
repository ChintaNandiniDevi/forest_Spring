package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cap.fms.entities.Orders;
import com.cap.fms.repository.IOrderDao;

public class OrderServiceImpl implements OrderService {

	@Autowired
	IOrderDao repo;
	
	public Orders getOrder(String orderNumber) {
		Orders orders=repo.findByOrderNumber(orderNumber);
		return orders;
	}

	@Transactional
	public Orders addOrder(Orders orders) {
		Orders or=repo.save(orders);
		return or;
	}

	@Transactional
	public Orders updateOrder(Orders orders) {
		Orders or=repo.save(orders);
		return or;
	}

	@Transactional
	public Orders deleteOrder(String orderNumber) {
		Orders or=repo.deleteByOrderNumber(orderNumber);
		return or;
	}

	public List<Orders> getAllOrders() {
		List<Orders> ordersList=repo.findAll();
		return ordersList;
	}

}
