package com.cap.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Orders;

@Repository
public interface IOrderDao extends JpaRepository<Orders, String> {
	Orders findByOrderNumber(String orderNumber);//string
	//boolean addOrder(Orders orders);//Orders
	//boolean updateOrder(Orders orders);//Orders
	
	

	@Query("Delete from Orders where orderNumber=:orderNumber")
	Orders deleteByOrderNumber(String orderNumber);//String
	//List <Orders> getAllOrders();
	
	
}
