package com.hibernate.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtils;

public class EmployeeService {
	private static SessionFactory factory = HibernateUtils.getSessionFactory();
	
	public static void addEmployee(Employee e) {
		Transaction transaction = null;
		try(Session session = factory.openSession()){
			transaction = session.beginTransaction();
			session.save(e);
			transaction.commit();
		}
	}
	
	public static Employee loadEmployee(String id) {
		try(Session session = factory.openSession()){
			return session.load(Employee.class, id);
		}
	}
	
	public static Employee getEmployee(String id) {
		try(Session session = factory.openSession()){
			return session.get(Employee.class, id);
		}
	}
	
	public static void updateEmployee(Employee emp) {
		try (Session session = factory.openSession()){
			session.update(emp);
		}
	}
	
}
