package edu.fiu.loyaltyprogram;

import java.util.Date;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Benefits implements SelfCheckCapable {
	
	/*
	 * The premise of the Benefits class is that 
	 * we can choose to provide different benefits
	 * and/or more then one benefit to a status tier
	 */
	
	String name;
	String amount;
	Boolean active;
	Date startDate;
	Date endDate;
	

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Benefits system";
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
