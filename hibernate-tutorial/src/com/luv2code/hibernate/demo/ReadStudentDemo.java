package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//creater session factory
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Student.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating Student object");
			Student tempStudent=new Student("daffy","duck","duck@gmail.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			//NEW CODE
			//get student id
			System.out.println("Saved student. Generate id:"+tempStudent.getId());
			
			// now get a new session and start transaction
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student of id
			
			System.out.println("\n Getting student with id: "+tempStudent.getId());
			
			Student myStudent=session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get Complete: "+myStudent);
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
	

}
