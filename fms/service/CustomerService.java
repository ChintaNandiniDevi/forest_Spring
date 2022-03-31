package com.cap.fms.service;


import java.util.List;
import com.cap.fms.entities.*;
public interface CustomerService {
  Customer serviceGetCustomer(String customerId);//String
  Customer serviceAddCustomer(Customer customer);//Customer
  Customer serviceUpdateCustomer(Customer customer);//Customer
  Customer serviceDeleteCustomer(String customerId);//Customer
  List<Customer> serviceGetAllCustomer();
}
