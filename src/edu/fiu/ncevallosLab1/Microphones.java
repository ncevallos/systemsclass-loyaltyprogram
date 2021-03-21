/**
 * 
 */
package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author ncevallos
 *
 */
public class Microphones implements SelfCheckCapable {


	
	/**
	 * Starts recording sound
	 */
	void startRecording() {
		
	}
	
	/**
	 * stops recording sound
	 */
	void endRecording() {
		
	}
	
	/**
	 * Returns data to main computer brain
	 */
	void returnData() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Microphones system";
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
