package com.cap.fms.service;

import java.util.List;

import com.cap.fms.entities.Product;

public interface ProductService {
	Product getProduct(String ProductName);
	Product addProduct(Product Product);
	Product updateProduct(Product Product);
	Product deleteProduct(String Product);
	List<Product> getAllProducts();
}