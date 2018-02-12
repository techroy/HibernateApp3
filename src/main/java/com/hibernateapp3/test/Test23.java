package com.hibernateapp3.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.hibernateapp3.cfg.HibernateConfiguration;
import com.hibernateapp3.model.EmployeeBean;

public class Test23 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Criteria criteria = session.createCriteria(EmployeeBean.class);

		Criterion criterion1 = Restrictions.like("ename", "%M%");
		
		Criterion criterion2 = Restrictions.between("eid",13,14);
		
		Criterion andCond = Restrictions.and(criterion1, criterion2);
		
		criteria.add(andCond);
		
		List<EmployeeBean> employeeBeans = criteria.list();
		
		
		for (EmployeeBean employeeBean : employeeBeans) {
			System.out.println(employeeBean);
		}

		session.close();
		sessionFactory.close();

	}
}
