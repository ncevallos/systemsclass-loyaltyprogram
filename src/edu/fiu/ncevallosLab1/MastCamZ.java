package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;


public class MastCamZ extends Camera {
	/**
	* takes a 3D image
	*/
	void take3Dimage() {
			
	}
	/**
	* records an HS recording
	*/
	void recordHDVideo() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "MastCamZ system";
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