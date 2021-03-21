package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Camera implements SelfCheckCapable {

	
	/**
	 * moves the wheel forward
	 */
	 void takeSnapshot() {
				 
		 
	 }
	 /**
	 * moves the wheel reverse
	 */
	 void startCamera() {
					 
			 
	}
	 
	 /**
	 * moves the wheel reverse
	 */
	 void endCamera() {
					 
			 
	}

	/**
	* Returns data back to the rover body
	*/
	void returnData() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "General Camera system";
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
