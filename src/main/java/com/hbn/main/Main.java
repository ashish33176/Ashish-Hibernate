package com.hbn.main;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("Vikas", "male", 330000);
		
		
			
//     2.
		Session session = HibernateConfig.getSessionFactory().openSession();

//     4.
		Transaction tx = session.beginTransaction();
		
		session.persist(e);
		
		tx.commit();
			
		

	}

}
