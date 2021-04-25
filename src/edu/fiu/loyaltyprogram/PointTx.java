package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class PointTx implements SelfCheckCapable {


	/**
	* This class will be used for a point transaction to take place
	*/
	void processPointTx() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Point Transaction system";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
