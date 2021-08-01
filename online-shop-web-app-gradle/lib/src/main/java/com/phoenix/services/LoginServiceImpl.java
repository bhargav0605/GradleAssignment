package com.phoenix.services;
/*
 * Author: bhargav.parmar@stltech.in
 * version: 1.0.0
 * Date: 07-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */

import java.sql.SQLException;
import java.util.List;

import com.phoenix.daos.LoginDao;
import com.phoenix.daos.LoginDaoImpl;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceExceptions;
import com.phoenix.exceptions.UserNotFoundException;

public class LoginServiceImpl implements LoginService{
	
	// DAO Interface
	private LoginDao loginDao; 
	
	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}

	@Override
	public List<User> findAll() throws ServiceExceptions {
		return loginDao.getAllUsers();
	}

	@Override
	public User findByUserId(String username) throws UserNotFoundException{

		User user =  loginDao.getUserById(username); 
		if(user != null) {
			return user;
		} else {
			throw new UserNotFoundException("Sorry! No user found.");
		}
	}

	@Override
	public void add(User user) throws  ServiceExceptions {
		loginDao.insert(user);
		
	}

	@Override
	public void edit(User user) throws ServiceExceptions {
		loginDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceExceptions {
		loginDao.delete(user);	
	}

	@Override
	public String changePassword(String newPassword) throws ServiceExceptions {
		// TODO Auto-generated method stub
		User user = new User();
		user.setPassword(newPassword);
		loginDao.update(user);
		return "Password is updated.";
	}
}
