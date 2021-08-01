package com.phoenix.daos;
/*
 * Author: bhargav.parmar@stltech.in
 * version: 2.0.0
 * Date: 09-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */

import java.util.List;

import com.phoenix.data.User;

public interface LoginDao {
	
	//CRUD - Operations that has to be performed in implemented classes
	List<User> getAllUsers();
	User getUserById(String username);
	void insert(User user);
	void delete(User user);
	void update(User user);
} // end of class
