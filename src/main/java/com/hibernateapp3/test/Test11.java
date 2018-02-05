package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test11 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Query query = session.createQuery("Select eb from EmployeeBean as eb where eid>=? and eid<=:maxId and ename like :enam");
		
		query.setInteger(0, 10);
		
		query.setInteger("maxId", 13);
		query.setString("enam", "M%");
		
		//query.setString(1, "M%");
		
		List<EmployeeBean> employeeBeans = query.list();
		System.out.println("---------------");
		
		for(EmployeeBean emp : employeeBeans){
			
			System.out.println(emp);
		}
		
		
		session.close();
		sessionFactory.close();
		
		
		
		

	}

}
