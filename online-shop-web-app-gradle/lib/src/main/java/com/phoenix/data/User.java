package com.phoenix.data;

//import javax.persistence.Column;
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
@Table(name="login")
public class User {
	
	//declaration of variable
	@Id
	private String username;
	//@Column
	private String password;
	
	//getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
} // end of class
