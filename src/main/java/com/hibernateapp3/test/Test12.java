package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test12 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		//Query query = session.createQuery("Select count(eid) from EmployeeBean");
		Query query = session.createQuery("Select count(eid),sum(eid),avg(eid) from EmployeeBean");
		
		List l = query.list();
		
		//System.out.println("---------------"+(Long)l.get(0));
		
		//System.out.println(l.get(0).getClass().getName());
		
		/*for(Object ob : l){
			
			Object[] arr = (Object[])ob;
			
			for(Object aggr:arr){
				System.out.println(aggr);
			}
			
		}*/
		
		Object ob = l.get(0);
		Object[] arr = (Object[])ob;
		
		for(Object aggr:arr){
			System.out.println(aggr);
		}
		
		
		
		
		
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
