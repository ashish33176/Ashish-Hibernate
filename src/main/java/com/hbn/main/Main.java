package com.hbn.main;


import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;
import org.hibernate.Session;

import org.hibernate.Transaction;


public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Vinay", "male", 330000);	
		
		
		
		Session session = HibernateConfig.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
 //       session.load(e1, 4);
		
		Employee employee =session.find(Employee.class, 555);
		
//		System.out.println(e1);
		
		System.out.println(employee);
		
		tx.commit();
			
		
		
		

	}

}
