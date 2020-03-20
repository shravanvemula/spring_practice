package com.assignment.springboot.cricket.ScorecardApplication.implementation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.assignment.springboot.cricket.ScorecardApplication.player.IBatsmen;
import com.assignment.springboot.cricket.ScorecardApplication.player.IBowler;
import com.assignment.springboot.cricket.ScorecardApplication.player.IFielder;


@Component  // it indicates Spring to auto detect these classes for dependency injection when annotation-based configuration and classpath scanning is used.
@Scope("prototype")   //indicates scope of a bean is prototype
public class ScorecardImpl {
	
	//getting values from application.properties file using @Value annotation
	
	@Value("${batsmen.runs}")
	private int numberOfRunsScored;
	
	@Value("${batsmen.sixes}")
	private int numberOfSixesScored;
	
	@Value("${bowler.wickets}")
	private int numberOfWickets;
	
	@Value("${bowler.runs}")
	private int numberOfRunsConceded;
	
	@Value("${fielder.catches}")
	private int numberOfCatches;
	
	@Value("${fielder.runs}")
	private int numberOfRunsStopped;

	//Injecting Bean of class Batsmen using a field
	@Autowired
	private IBatsmen batsmen;
	
	
	//Injecting Bean of class Bowler using a constructor
	private IBowler bowler;
	
	@Autowired
	public ScorecardImpl(IBowler bowler) {
		this.bowler=bowler;
	}
	
	//Injecting Bean of class Fielder using a setter
	private IFielder fielder;
	@Autowired
	public void setFielder(IFielder fielder) {
		this.fielder=fielder;
	}
	
	
	//loading data using setters using @PostConstruct annotation
	//@PostConstruct annotation's custom logic is executed during bean initialization
	
	@PostConstruct
	public void loadData() {
		
		batsmen.setNumberOfRunsScored(numberOfRunsScored);
		batsmen.setNumberOfSixesScored(numberOfSixesScored);
		
		bowler.setNumberOfWickets(numberOfWickets);
		bowler.setNumberOfRunsConceded(numberOfRunsConceded);
		
		fielder.setNumberOfCatches(numberOfCatches);
		fielder.setNumberOfRunsStopped(numberOfRunsStopped);

	}
	
	
	public String displayScorecard() {
		
		
		return "Number of runs scored by the batsmen:"+batsmen.getNumberOfRunsScored() 
		+ ". Number of sixes scored by the batsmen:"+batsmen.getNumberOfSixesScored() 
		+". Number of wickets taken by the bowler:"+bowler.getNumberOfWickets()
		+". Number of runs conceded by the bowler:"+bowler.getNumberOfRunsConceded()
		+". Number of catches taken by the fielder:"+fielder.getNumberOfCatches()
		+". Number of runs stopped by the fielder:"+fielder.getNumberOfRunsStopped();
		
		
	}
	
}
