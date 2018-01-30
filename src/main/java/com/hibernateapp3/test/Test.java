package com.hibernateapp3.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		
		Session session = HibernateConfiguration.getSession(sessionFactory);
		
		Transaction tx  = session.beginTransaction();
		
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(11);
		employeeBean.setEname("Max1");
		employeeBean.setEsal(400.00f);
		
		session.save(employeeBean);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();
		

	}

}
