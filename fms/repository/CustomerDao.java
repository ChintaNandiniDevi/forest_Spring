package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String> {
	//boolean loginCustomer();
	Customer findByCustomerId(String customerId);
	//boolean addCustomer();
	//boolean updateCustomer();
	
	@Query("Delete from Customer where customerId=:customerId")
	Customer deleteByCustomerId(String customerId);
	//List<Customer> getAllCustomers();
	
     
}
