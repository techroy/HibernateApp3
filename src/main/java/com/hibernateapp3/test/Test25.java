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
import com.hibernateapp3.model.EmployeeBean;

public class Test25 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Criteria criteria = session.createCriteria(EmployeeBean.class);

		
		Projection p1 = Projections.avg("eid");
		Projection p2 = Projections.sum("eid");
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(p1);
		projectionList.add(p2);
		
		criteria.setProjection(projectionList);
		
		List l = criteria.list();
		
		Object[] arr  = (Object[])l.get(0);
		
		System.out.println(arr[0]+"--"+arr[1]);
		
		
		
		session.close();
		sessionFactory.close();

	}
}
