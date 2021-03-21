package edu.fiu.ncevallosLab1;

import edu.fiu.sysdesign.SelfCheckUtils;


public class SHERLOC extends Camera {
	String spectrometer;
	String UVLaser;
	String magnifyingGlass;
	
	/**
	* the space suit material is located on the SHERLOC to see how the material will hold up to the harshness 
	* of the martian atmosphere
	*/
	String spacesuitMaterial;
	
	/**
	* the camera on SHERLOC is an integrated 'context' macro camera
	* SHERLOC uses all of its attributes to look for signs of life
	*/
	void searchForLife() {
			
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "SHERLOC system";
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