package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;

public class Test8 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("Select ename from EmployeeBean");
		
		List l = query.list();
		
		for(Object object:l){
			
			System.out.println(object);
		}
		
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
