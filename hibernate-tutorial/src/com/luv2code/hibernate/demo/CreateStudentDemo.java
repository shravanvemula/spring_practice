package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//creater session factory
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Student.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Student object");
			Student tempStudent=new Student("jon","walk","232@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student...");
			session.save(tempStudent);
			
			session.getTransaction().commit();
			System.out.println("Done!");
		
		}
		finally {
			factory.close();
		}
	}
	

}
