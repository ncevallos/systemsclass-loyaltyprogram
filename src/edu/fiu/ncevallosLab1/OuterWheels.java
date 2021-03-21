package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;

public class OuterWheels extends Wheels {

	 /**
	 * turns the wheels
	 */
	void Steer() {
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Outer Wheels system";
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
