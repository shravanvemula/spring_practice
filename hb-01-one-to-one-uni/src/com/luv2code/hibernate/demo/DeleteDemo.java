package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		//creater session factory
		
		SessionFactory factory=new Configuration()
								   .configure("hibernate.cfg.xml")
								   .addAnnotatedClass(Instructor.class)
								   .addAnnotatedClass(InstructorDetail.class)
								   .buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			
			
		
			session.beginTransaction();
			
			int id=299;
			
			Instructor tmp=session.get(Instructor.class,id);
			
			
			System.out.println("Found "+tmp);
			
			if(tmp!=null) {
				System.out.println("Deleting: "+tmp);
				session.delete(tmp);
			}
			//this will also delete associated "details" object
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}
	

}
