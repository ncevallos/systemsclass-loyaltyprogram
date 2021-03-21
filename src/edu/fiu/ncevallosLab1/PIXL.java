package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class PIXL implements SelfCheckCapable {
	
	/**
	 * takes an xray
	 */
	 void takeXRAY() {
				 
		 
	 }
	 /**
	 * looks for changes in textures and chemicals in Martian rocks
	 */
	 void scan() {
					 
			 
	}
	 /**
	 * returns the data to the main computer
	 */
	 void returnData() {
					 
			 
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "PIXL system";
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