package com.hibernateapp3.test;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test6 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("from EmployeeBean");
		
		
		Iterator<EmployeeBean> it = query.iterate();
		
		System.out.println("---------------");
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
