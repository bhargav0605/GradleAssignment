package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Author: bhargav.parmar@stltech.in
 * version: 2.0.0
 * Date: 09-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */
//Value Object class - Java Bean Class - POJO - Persistent Class or Entity Class
@Entity
@Table(name="product1")
public class Product {
	
	@Id
	private int id;
	private String name;
	private String brand;
	private float price;
	
	//Default Constructor
	public Product() {
		super();
	}
	
	//Parameterized Constructor
	public Product(int id, String name, String brand, float price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	//Getters Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
} //end of class
