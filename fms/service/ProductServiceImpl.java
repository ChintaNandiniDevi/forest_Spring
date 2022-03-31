package com.cap.fms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.fms.entities.Product;
import com.cap.fms.repository.IProductDao;


public class ProductServiceImpl implements ProductService {

	@Autowired
	IProductDao repo;
	

	
	public Product getProduct(String productName) {
		Product Product=repo.findByProductName(productName);
		return Product;
	}

	@Transactional
	public Product addProduct(Product product) {
		Product pro =repo.save(product);
		return pro;
	}

	@Transactional
	public Product updateProduct(Product product) {
		Product pro =repo.save(product);
		return pro;
	}

	@Transactional
	public Product deleteProduct(String productName) {
		Product pro =repo.deleteByProductName(productName);
		return pro;
	}

	public List<Product> getAllProducts() {
			List<Product> productList=repo.findAll();
		return productList;
	}
}