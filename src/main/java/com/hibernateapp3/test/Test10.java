package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test10 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("Select eb from EmployeeBean as eb where eid>=:minId and eid<=:maxId");
		System.out.println(query.getClass().getName());
		
		query.setInteger("minId", 10);
		
		query.setInteger("maxId", 13);
		
		List<EmployeeBean> employeeBeans = query.list();
		System.out.println("---------------");
		
		for(EmployeeBean emp : employeeBeans){
			
			System.out.println(emp);
		}
		
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
