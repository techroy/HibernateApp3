package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test21 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Criteria criteria = session.createCriteria(EmployeeBean.class);

		criteria.setFirstResult(1);
		criteria.setMaxResults(3);

		List<EmployeeBean> employeeBeans = criteria.list();

		for (EmployeeBean employeeBean : employeeBeans) {
			System.out.println(employeeBean);
		}

		session.close();
		sessionFactory.close();

	}
}
