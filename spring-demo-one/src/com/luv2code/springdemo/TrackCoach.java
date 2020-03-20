package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "spend 30 minutes running";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : bean init ");
	}
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach : bean destroy ");
	}
	
	

}
