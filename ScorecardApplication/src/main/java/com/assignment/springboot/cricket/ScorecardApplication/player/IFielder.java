package com.assignment.springboot.cricket.ScorecardApplication.player;

public interface IFielder {
	
	public void setNumberOfCatches(int catches);
	public void setNumberOfRunsStopped(int runs);
	public int getNumberOfCatches();
	public int getNumberOfRunsStopped();

}
