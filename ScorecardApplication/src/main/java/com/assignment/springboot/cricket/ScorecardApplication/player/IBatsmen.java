package com.assignment.springboot.cricket.ScorecardApplication.player;

public interface IBatsmen {

	public void setNumberOfRunsScored(int runs);
	public void setNumberOfSixesScored(int sixes);
	public int getNumberOfRunsScored();
	public int getNumberOfSixesScored();
}
