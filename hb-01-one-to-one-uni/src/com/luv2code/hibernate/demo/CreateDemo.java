package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {
		//creater session factory
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Instructor.class)
								   .addAnnotatedClass(InstructorDetail.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			Instructor instructor=new Instructor("Madhu","patel","23eee12@gmail.com");
			
			InstructorDetail temp=new InstructorDetail("www.ewefedede.com","Luv2ceode");
			
			instructor.setInstructorDetail(temp);
			
			session.beginTransaction();
			
			session.save(instructor);  //because CascadeType.ALL ,it also saves instructor details
			
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		finally {
			factory.close();
		}
	}
	

}
