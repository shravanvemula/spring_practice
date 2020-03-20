package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Student.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating 3 Student objects");
			
			Student tempStudent1=new Student("jon1","walk1","2321@gmail.com");
			Student tempStudent2=new Student("jon2","walk2","2322@gmail.com");
			Student tempStudent3=new Student("jon3","walk3","2323@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally {
			factory.close();
		}

	}

}
