package edu.fiu.ncevallosLab1;


import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Wheels implements SelfCheckCapable {
	String motor;
	
	/**
	 * moves the wheel forward
	 */
	 void Forward() {
				 
		 
	 }
	 /**
	 * moves the wheel reverse
	 */
	 void Reverse() {
					 
			 
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheels system";
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
