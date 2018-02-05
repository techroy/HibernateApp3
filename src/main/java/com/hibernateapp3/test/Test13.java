package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test13 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("from EmployeeBean where eid=(select max(eid) from EmployeeBean)");

		List l = query.list();

		System.out.println(l.get(0));

		session.close();
		sessionFactory.close();

	}

}
