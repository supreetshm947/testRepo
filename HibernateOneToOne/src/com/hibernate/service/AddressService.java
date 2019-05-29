package com.hibernate.service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Address;
import com.hibernate.util.HibernateUtils;

public class AddressService {
	private static SessionFactory factory = HibernateUtils.getSessionFactory();
	
	public static void addAddress(Address address) {
		Transaction transaction = null;
		try (Session session = factory.openSession()){
			transaction = session.beginTransaction();
			session.save(address);
		}finally {
			transaction.commit();
		}
	}
}
