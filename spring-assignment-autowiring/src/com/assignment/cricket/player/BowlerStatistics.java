package com.assignment.cricket.player;

import org.springframework.stereotype.Component;

@Component
public class BowlerStatistics implements IBowler {

	
	private int numberOfWickets;
	private int numberOfRunsConceded;
	
	@Override
	public int getNumberOfWickets() {
		return numberOfWickets;
	}
	@Override
	public void setNumberOfWickets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	@Override
	public int getNumberOfRunsConceded() {
		return numberOfRunsConceded;
	}
	
	@Override
	public void setNumberOfRunsConceded(int numberOfRunsConceded) {
		this.numberOfRunsConceded = numberOfRunsConceded;
	}
	
	
}
