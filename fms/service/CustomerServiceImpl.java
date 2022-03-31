package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cap.fms.entities.Customer;
import com.cap.fms.repository.CustomerDao;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao repo;
	
	
	public Customer serviceGetCustomer(String customerId) {
		Customer customer=repo.findByCustomerId(customerId);
		return customer;
	}

	@Transactional
	public Customer serviceAddCustomer(Customer customer) {
		Customer cust=repo.save(customer);
		return cust;
	}

	@Transactional
	public Customer serviceUpdateCustomer(Customer customer) {
		Customer cust=repo.save(customer);
		return cust;
	}

	@Transactional
	public Customer serviceDeleteCustomer(String customerId) {
		Customer cust=repo.deleteByCustomerId(customerId);
		return cust;
	}

	public List<Customer> serviceGetAllCustomer() {
		List<Customer> contractList=repo.findAll();
		return contractList;
	}

	

}
