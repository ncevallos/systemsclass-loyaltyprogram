package edu.fiu.loyaltyprogram;


public class Tier {
	
	String name = "Platinum";
	/*
	 * 
	 */
	Boolean active = true;
	Integer pointsRequired = 8000;
	Double pointAccuralRate = 1.5;
	
	void setName() {
		
	}
	
	public String getName() {
		return name;
	}
	 public Boolean checkStatus() {
		return active;
		 
	 }

}