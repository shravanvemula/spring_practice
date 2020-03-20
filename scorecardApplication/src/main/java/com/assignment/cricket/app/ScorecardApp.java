package com.assignment.cricket.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assignment.cricket.config.ScorecardConfig;
import com.assignment.cricket.implementation.ScorecardImpl;

public class ScorecardApp {

	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScorecardConfig.class);

		ScorecardImpl scorecard=context.getBean("scorecardImpl",ScorecardImpl.class);
		
		scorecard.displayScorecard();
		
		context.close();
	}

}
