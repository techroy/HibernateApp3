package com.hibernateapp3.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernateapp3.cfg.HibernateConfiguration;

public class Test17 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Transaction tx = session.beginTransaction();

		//Query query = session.getNamedQuery("selectBookQuery");

		
		//List<BookBean> bookBeans= query.list();
		

		/*for(BookBean bookBean : bookBeans){
			
			System.out.println(bookBean);
		}*/
		Query query = session.getNamedQuery("updatBookQuery");
		
		query.setString(0,"abcxyz");
		query.setString(1,"b8a7dffd-0572-11e8-8f60-70f3953a0f26");
		
		int row  = query.executeUpdate();
		
		System.out.println(row);
		
		tx.commit();
		

		session.close();
		sessionFactory.close();
	}
}
