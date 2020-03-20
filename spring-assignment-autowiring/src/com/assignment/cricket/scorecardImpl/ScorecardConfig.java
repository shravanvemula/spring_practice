package com.assignment.cricket.scorecardImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.assignment.cricket.player.BowlerStatistics;
import com.assignment.cricket.player.IBowler;

@Configuration
@ComponentScan("com.assignment.cricket") 
@PropertySource("classpath:scorecard.properties")
public class ScorecardConfig {
		

	@Bean
	public IBowler getBowler() {
		return new BowlerStatistics();
	}
	
	@Bean 
	public ScorecardImpl scorecardImpl() {
		return new ScorecardImpl(getBowler());
	}
	
}
