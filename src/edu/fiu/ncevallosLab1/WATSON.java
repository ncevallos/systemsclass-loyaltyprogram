package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;

public class WATSON extends Camera {
	/**
	* identify targets of interest for SHERLOC
	*/
	void identifyTargets() {
			
	}
	/**
	* since it is located on the arm this camera can be used to examine the rover
	*/
	void checkRoverParts() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "WATSON system";
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