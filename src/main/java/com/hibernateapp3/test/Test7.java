package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;

public class Test7 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("Select eid,ename from EmployeeBean");
		
		List l = query.list();
		
		for(Object object:l){
			
			Object[]  obj = (Object[])object;
			
			for(Object ob:obj){
				
				System.out.print(ob+"--");
			}
			
			System.out.println();
		}
		
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
