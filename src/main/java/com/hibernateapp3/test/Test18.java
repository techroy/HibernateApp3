package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test18 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		Query query = session.createSQLQuery("select * from Employee");
		
		System.out.println(query.getClass().getName());
		SQLQuery sqlQuery = (SQLQuery) query;
		sqlQuery.addEntity(EmployeeBean.class);
		
		
		List<EmployeeBean> l =query.list();
		
		
		
		/*for(Object ob : l){
			
			Object[] arr = (Object[]) ob;
			
			for(Object object:arr){
				
				System.out.print(object+"--");
			}
			
			System.out.println();
			
		}*/
		
		for(EmployeeBean employeeBean : l){
			System.out.println(employeeBean);
		}
		
		
		tx.commit();
		

		session.close();
		sessionFactory.close();
	}
}
