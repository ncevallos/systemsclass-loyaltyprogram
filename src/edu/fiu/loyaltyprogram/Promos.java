package edu.fiu.loyaltyprogram;

import java.util.Date;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Promos implements SelfCheckCapable {
	
	/*
	 * The premise of the Promos class is that 
	 * we can choose to provide different promotional
	 * specials like happy hour, where guests do not have
	 * to have a membership to be able to received those
	 * discounts or items
	 */
	
	String name;
	Boolean active;
	Date startDate;
	Date endDate;
	
	void setName() {
		
	}
	
	public String getName() {
		return name;
	}


	void setStartDate() {
		
	}
	
	public Date getStartDate() {
		return startDate;
	}

	void setEndDate() {
		
	}
	
	public Date getEndDate() {
		return endDate;
	}

	 public Boolean checkStatus() {
		return active;
		 
	 }

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Promos system";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}