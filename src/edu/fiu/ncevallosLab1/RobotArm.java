package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class RobotArm implements SelfCheckCapable {
	String handTurret;
	String drill;
	/**
	 * extends the arm out
	 */
	void extend() {
		
	}
	
	/**
	 * brings the arm in back to the body
	 */
	void retract() {
		
	}
	
	/**
	 * Returns data back to the rover body
	 */
	void returnData() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "RobotArm system";
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