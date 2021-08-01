package com.phoenix.daos;
/*
 * Author: bhargav.parmar@stltech.in
 * version: 2.0.0
 * Date: 09-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */

import java.util.List;

import com.phoenix.data.Product;

public interface ProductDao {
	
	//Basic CRUD Methods
	Product getProductById(int id);
	List<Product> getAllProduct();
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
} // end of class
