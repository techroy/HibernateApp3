package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.BookBean;
import com.hibernateapp3.model.EmployeeBean;

public class Test26 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		//Query query = session.createSQLQuery("call GetBooks(?)").addEntity(BookBean.class).setString(0, "400");
		
		Query query = session.getNamedQuery("bookStoreProc").setString(0, "400");

		List<BookBean> bookBeans = query.list();
		
		for(BookBean bookBean : bookBeans){
			System.out.println(bookBean);
		}
		
		session.close();
		sessionFactory.close();

	}
}
