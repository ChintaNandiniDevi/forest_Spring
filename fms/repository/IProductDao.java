package com.cap.fms.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.fms.entities.Product;

@Repository
public interface IProductDao extends JpaRepository<Product, String>{
	Product findByProductName(String productName);//String
	//boolean addProduct(Product product);//Land
	//boolean updateProduct(Product product);//Land
	

	@Query("Delete from Land where productName=:productName")
	Product deleteByProductName(String productName);//String
	//List<Product> getAllProducts();
}