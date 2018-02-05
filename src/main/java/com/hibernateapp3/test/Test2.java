package com.hibernateapp3.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.ProductBean;
import com.hibernateapp3.model.ProductKeyBean;

public class Test2 {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);
		
		Transaction tx = session.beginTransaction();
		
		ProductKeyBean productKeyBean = new ProductKeyBean();
		productKeyBean.setId(1);
		productKeyBean.setName("laptop");
		
		ProductBean productBean =new ProductBean();
		productBean.setProductKeyBean(productKeyBean);
		productBean.setPrice("30000");
		
		session.save(productBean);
		
		tx.commit();
		
		session.close();
		sessionFactory.close();

	}

}
