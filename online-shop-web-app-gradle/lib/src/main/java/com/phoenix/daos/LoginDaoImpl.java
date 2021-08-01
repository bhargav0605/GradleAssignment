package com.phoenix.daos;
/*
 * Author: bhargav.parmar@stltech.in
 * version: 2.0.0
 * Date: 09-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.User;

public class LoginDaoImpl implements LoginDao{
	
	private static Session session;
	
	static {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Oracle connection established.");
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Query query = session.createQuery("from User");
		return query.getResultList();
	}

	@Override
	public User getUserById(String username) {
		return session.get(User.class, username);
	}

	@Override
	public void insert(User user) {
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

	@Override
	public void delete(User user) {
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
	}

	@Override
	public void update(User user) {
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
	}
} // end of class
