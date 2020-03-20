package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortunes());

		boolean result = (theCoach == alphaCoach);
		System.out.println(result);
		System.out.println("\n Memory Location for theCoach:" + theCoach);
		System.out.println("\n Memory Location for theCoach:" + alphaCoach);

		context.close();

	}

}
