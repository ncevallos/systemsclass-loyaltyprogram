package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckUtils;

public class Dishes extends Goods {
	/*
	 * This class is for dishes which are an extension of goods
	 * and designed as main entree type dishes
	 */
	


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Dishes class";
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
