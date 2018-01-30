package com.hibernateapp3.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.BookBean;
import com.hibernateapp3.model.EmployeeBean;

public class Test1 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		BookBean bookBean = new BookBean();
		bookBean.setId("b8a7dffd-0572-11e8-8f60-70f3953a2e21");
		bookBean.setName("Spring core1");
		bookBean.setPrice("400");

		session.save(bookBean);

		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
