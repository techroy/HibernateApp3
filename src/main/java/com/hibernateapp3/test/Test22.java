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

public class Test22 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		Session session = HibernateConfiguration.getSession(sessionFactory);

		Criteria criteria = session.createCriteria(EmployeeBean.class);

		Criterion criterion = Restrictions.between("eid",13,14);
		
		criteria.add(criterion);

		List<EmployeeBean> employeeBeans = criteria.list();

		for (EmployeeBean employeeBean : employeeBeans) {
			System.out.println(employeeBean);
		}

		session.close();
		sessionFactory.close();

	}
}
