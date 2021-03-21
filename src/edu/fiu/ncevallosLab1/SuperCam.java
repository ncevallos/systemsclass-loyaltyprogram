package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;


public class SuperCam extends Camera {
	/**
	* Identify the chemical composition of whatever it points the camera at
	*/
	void identifyComposition() {
			
	}

	/**
	* measure the air quality and what the current makeup of the air is
	*/
	void measureAir() {
			
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Super Cam system";
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
