package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;



public class QueryStudentDemo {

	public static void main(String[] args) {
		//creater session factory
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Student.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
	
			//query students
			
			session.beginTransaction();
			
		
			List<Student> students=session.createQuery("from Student").list();
			
			
			//display the students
			displayStudents(students);
			
			
			students=session.createQuery("from Student s where s.lastName='duck'").list();
			
			
			//display the students
			System.out.println("Student having last name:duck");
			
			displayStudents(students);
			
				
			students=session.createQuery("from Student s where s.lastName='duck' OR s.firstName LIKE '%jon1'").list();
			
			
			//display the students
			System.out.println("Student having last name:duck or walk");
			
			displayStudents(students);
			
			
			session.getTransaction().commit();
			
	
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> students) {
		for(Student tempStudent:students) {
			System.out.println(tempStudent);
		}
	}
	

}
