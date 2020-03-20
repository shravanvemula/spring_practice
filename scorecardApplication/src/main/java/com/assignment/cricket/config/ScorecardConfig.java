package com.assignment.cricket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.assignment.cricket.implementation.ScorecardImpl;
import com.assignment.cricket.player.BowlerStatistics;
import com.assignment.cricket.player.IBowler;


@Configuration //indicates that the class has @Bean definition methods
@ComponentScan("com.assignment.cricket") //indicates spring to scan for @component in given package
@PropertySource("classpath:application.properties")  //indicates spring to scan for properties in the specified file
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
