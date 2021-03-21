package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;

public class NavCams extends Camera {
	/**
	* Watches over the samples within the Cache
	*/
	void assistNavigation() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "NavCams system";
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
