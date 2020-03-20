package com.assignment.springboot.cricket.ScorecardApplication.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springboot.cricket.ScorecardApplication.implementation.ScorecardImpl;



@RestController  //It indicates  takes spring to care of mapping request data to the defined request handler method
public class ScorecardController {
		
	private ScorecardImpl scorecardImpl;
	
	@Autowired   //injecting bean of scorecardImpl
	public ScorecardController(ScorecardImpl impl)
	{
		scorecardImpl=impl;
	}
	
	@GetMapping("/scorecard")  //It indicates spring to execute this method whenever this mapping is used
	public String displayScorecard() {
		
		return scorecardImpl.displayScorecard();
	}
	
	
}












