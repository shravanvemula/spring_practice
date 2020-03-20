package com.assignment.cricket.player;

import org.springframework.stereotype.Component;

@Component
public class FielderStatistics implements IFielder {

	
	private int numberOfCatches;
	private int numberOfRunsStopped;
	
	@Override
	public void setNumberOfCatches(int catches) {
		
		numberOfCatches=catches;
		
	}
	
	@Override
	public void setNumberOfRunsStopped(int runs) {
		numberOfRunsStopped=runs;
		
	}
	
	@Override
	public int getNumberOfCatches() {
		
		return numberOfCatches;
	}

	@Override
	public int getNumberOfRunsStopped() {
	
		return numberOfRunsStopped;
	}

	

}
