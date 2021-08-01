package com.phoenix.daos;
/*
 * Author: bhargav.parmar@stltech.in
 * version: 1.0.0
 * Date: 07-Jul-2021
 * Copyright: Sterlite Technology Ltd.
 */

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.phoenix.data.Product;

public class ProductDaoImpl implements ProductDao{
	
	private static Session session;
	
	static {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		session = factory.openSession();
		System.out.println("Oracle connection established.");
	}

	@Override
	public Product getProductById(int id) {
		return session.get(Product.class, id);
	}

	@Override
	public List<Product> getAllProduct() {
		return session.createQuery("from Product").getResultList();
	}

	@Override
	public void insert(Product product) {
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();	
	}

	@Override
	public void update(Product product) {
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();	
	}

	@Override
	public void delete(Product product) {
		Transaction tx = session.beginTransaction();
		session.save(product);
		tx.commit();
	}
	
} //end of class
