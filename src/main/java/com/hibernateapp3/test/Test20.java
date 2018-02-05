package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test20 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		
		Criteria criteria = session.createCriteria(EmployeeBean.class);
		System.out.println(criteria.getClass().getName());
		
		List<EmployeeBean> employeeBeans = criteria.list();
		
		for(EmployeeBean employeeBean : employeeBeans){
			
			System.out.println(employeeBean);
		}
		
		tx.commit();
		

		session.close();
		sessionFactory.close();
	}
}
