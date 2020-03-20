package com.assignment.cricket.player;

import org.springframework.stereotype.Component;

@Component
public class BatsmenStatistics implements IBatsmen {

	private int numberOfRunsScored;
	private int numberOfSixesScored;
	
	@Override
	public void setNumberOfRunsScored(int runs) {
		numberOfRunsScored=runs;
		
	}

	@Override
	public void setNumberOfSixesScored(int sixes) {
		numberOfSixesScored=sixes;
		
	}

	@Override
	public int getNumberOfRunsScored() {
		
		return numberOfRunsScored;
	}

	@Override
	public int getNumberOfSixesScored() {
		
		return numberOfSixesScored;
	}

	

}
