/**
 * 
 */
package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is my fancy deck class
 * @author ncevallos
 */
public class MEDA implements SelfCheckCapable {
	String sensors;
	
	/**
	 * Checks the current weather
	 */
	 void checkWeather() {
				 
		 
	 }
	 /**
	 * returns the results of checking the weather to the main computer
	 */
	 void returnData() {
					 
			 
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "MEDA system";
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
