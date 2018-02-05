package com.hibernateapp3.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.CourseBean;
import com.hibernateapp3.model.ProductBean;
import com.hibernateapp3.model.ProductKeyBean;

public class Test4 {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);
		
		Transaction tx = session.beginTransaction();
		
		CourseBean courseBean = new CourseBean();
		courseBean.setCourseName("Devops");
		courseBean.setDuration("2mnth");
		courseBean.setFees("6000");
		
		
		session.save(courseBean);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();

	}

}
