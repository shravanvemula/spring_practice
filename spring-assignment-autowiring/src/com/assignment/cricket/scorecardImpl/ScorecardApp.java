package com.assignment.cricket.scorecardImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScorecardApp {

	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScorecardConfig.class);

		ScorecardImpl scorecard=context.getBean("scorecardImpl",ScorecardImpl.class);
		
		scorecard.displayScorecard();
		
		context.close();
	}

}
