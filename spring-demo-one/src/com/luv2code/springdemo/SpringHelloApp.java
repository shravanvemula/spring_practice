package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("myCricketCoach",Coach.class);
		
		
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortunes());
		
		
		context.close();
	}

}
