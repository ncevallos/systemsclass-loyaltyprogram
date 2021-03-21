package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class RIMFAX implements SelfCheckCapable {
	String radar;
	
	/**
	 * Scan underneath the surface of the ground
	 */
	 void scanSubsurface() {
				 
		 
	 }
	 /**returns the data back to the main computer
	 */
	 void returnData() {
					 
			 
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RIMFAX system";
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