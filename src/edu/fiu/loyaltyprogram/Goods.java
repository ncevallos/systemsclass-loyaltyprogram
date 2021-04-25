/**
 * 
 */
package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ncevallos
 *
 */
public class Goods extends TicketItems {
	/*
	 * This goods class is a broad class for all goods 
	 * that can be purchased as a ticket item
	 */
	

	String name;
	Double price;
	Integer pointValue;
	
	
	void setName() {
		
	}
	
	public String getName() {
		return name;
	}	
	void setPrice() {
		
	}
	
	public Double getPrice() {
		return price;
	}

	void setPointValue() {
		
	}
	
	public Integer getPointValue() {
		return pointValue;
	}

	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Goods class";
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
