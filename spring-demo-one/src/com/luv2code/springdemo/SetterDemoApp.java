package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach=context.getBean("myCricketCoach",CricketCoach.class);
		
		
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortunes());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		
		context.close();
	}
	
}
