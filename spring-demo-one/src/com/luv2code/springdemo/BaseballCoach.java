package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes in batting";
	}
	@Override
	public String getDailyFortunes() {
		return fortuneService.getFortune();
	}
	
	
	
}
