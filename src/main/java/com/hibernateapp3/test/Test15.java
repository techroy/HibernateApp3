package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test15 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		Query query = session.getNamedQuery("empSelectQuery");

		query.setInteger(0, 3);
		query.setInteger(1, 13);

		List<EmployeeBean> employeeBeans = query.list();

		for (EmployeeBean employeeBean : employeeBeans) {

			System.out.println(employeeBean);
		}

		tx.commit();
		
		session.close();
		sessionFactory.close();
	}
}
