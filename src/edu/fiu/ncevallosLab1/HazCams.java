package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;

public class HazCams extends Camera {
	/**
	* Looks for Hazards
	*/
	void identifyHazards() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "HazCams system";
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
