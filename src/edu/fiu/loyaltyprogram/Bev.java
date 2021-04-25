package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckUtils;


public class Bev extends Goods {
	/*
	 * This class is for beverages which are an extension of goods
	 */
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Beverages class";
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
