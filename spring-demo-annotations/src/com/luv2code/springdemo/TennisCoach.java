package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService happyFortuneServiceRef;

	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService randomServiceRef;
	
	/*
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService databaseFortuneService;
	
	*/
	
	
	
	public TennisCoach() {
		System.out.println("I'm in default constructor");
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public void doSomeStuff() {
		System.out.println("Doing some crazy stuff");
	}

	*/
	@Override
	public String getDailyWorkOut() {
		return "play tennis for 30 minutes";
	}
	@Override
	public String getDailyFortune() {
		return randomServiceRef.getFortune();
	}
	
	
	
}
