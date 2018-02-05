package com.hibernateapp3.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;

public class Test14 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("delete from EmployeeBean where eid=?");

		query.setInteger(0, 16);
		
		int row = query.executeUpdate();

		System.out.println(row);

		tx.commit();
		
		session.close();
		sessionFactory.close();

	}

}
