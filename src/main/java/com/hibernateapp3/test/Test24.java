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

public class Test24 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Criteria criteria = session.createCriteria(EmployeeBean.class);

		Projection projection1 = Projections.property("eid");
		Projection projection2 = Projections.property("ename");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1, "eid");
		projectionList.add(projection2, "ename");

		criteria.setProjection(projectionList);

		criteria.setResultTransformer(new AliasToBeanResultTransformer(EmployeeBean.class));

		List<EmployeeBean> employeeBeans = criteria.list();

		for (EmployeeBean employeeBean : employeeBeans) {
			System.out.println(employeeBean);
		}

		/*
		 * List l = criteria.list();
		 * 
		 * for(Object ob:l){
		 * 
		 * Object[] arr = (Object[])ob;
		 * 
		 * for(Object object:arr){ System.out.print(object+"-"); }
		 * System.out.println(); }
		 */
		session.close();
		sessionFactory.close();

	}
}
