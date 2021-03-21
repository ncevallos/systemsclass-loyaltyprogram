package edu.fiu.ncevallosLab1;


import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class MOXIE implements SelfCheckCapable {

	/**
	 * begins the process to create oxygen
	 */
	void createOxygen() {
		
	}
	
	/**
	 * Returns data back to the rover body
	 */
	void returnData() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "MOXIE system";
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
