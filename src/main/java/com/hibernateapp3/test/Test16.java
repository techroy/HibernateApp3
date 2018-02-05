package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test16 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		Query query = session.getNamedQuery("empUpdateQuery");

		query.setString("name", "satish");
		query.setInteger("eid", 13);
		
		int row = query.executeUpdate();
		
		System.out.println(row);

		tx.commit();
		

		session.close();
		sessionFactory.close();
	}
}
