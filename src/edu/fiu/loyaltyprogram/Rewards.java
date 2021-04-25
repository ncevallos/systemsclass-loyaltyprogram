package edu.fiu.loyaltyprogram;

import java.util.Date;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Rewards implements SelfCheckCapable {
	String name;
	Integer pointValue;
	Date startDate;
	Date endDate;
	
	void setName() {
		
	}
	
	public String getName() {
		return name;
	}

	void setPointValue() {
		
	}
	
	public Integer getPointValue() {
		return pointValue;
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
	
	

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Rewards system";
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