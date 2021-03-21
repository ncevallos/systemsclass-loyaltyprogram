/**
 * 
 */
package edu.fiu.ncevallosLab1;

import edu.fiu.ncevallosLab1.CacheCam;

/**
 * @author ncevallos
 *
 */
public class RoverBody {

	/**
	 * @param args
	 */
	String computerBrain;
	String powerCenter;
	String Antenna;
	String sampleStorage;
	
	/**
	 * this method runs selfcheck in all the outer systems
	 */
	void outerSystemsCheck() {		


	}
	
	/**
	 * checks the temperature of the internal system to make sure the computer and other components 
	 * within the body do not get too hot or too cold
	 */
	void internalTemperatureCheck() {

	}
	
	/**
	 * if the internalTemperatureCheck finds that the system is nearing an undesirable temperature
	 * it takes the appropriate steps to adjust as necessary
	 */
	void adjustTemperature() {

	}
	
	/**
	 * receives transmission from Earth
	 */
	void receiveTransmission() {

	}
	
	/**
	 * send data back to Earth
	 */
	void sendTransmission() {

	}
	
	/**
	 * receives data from outer components
	 */
	void receiveData() {

	}
	
	/**
	 * this checks how the power center is doing in order to plan out what tasks it can do within the 
	 * upcoming sol (Mars day)
	 */
	void recordPowerStatus() {

	}
	
	/**
	 * this checks all the systems and components with the body, such as the brain and computers
	 */
	void internalSystemsCheck() {

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CacheCam cachecam = new CacheCam();
		cachecam.runSelfCheck();
		HazCams hazcams = new HazCams();
		hazcams.runSelfCheck();
		MastCamZ mastcamz = new MastCamZ();
		mastcamz.runSelfCheck();
		MEDA meda = new MEDA();
		meda.runSelfCheck();
		Microphones microphones = new Microphones();
		microphones.runSelfCheck();
		MOXIE moxie = new MOXIE();
		moxie.runSelfCheck();
		NavCams navcams = new NavCams();
		navcams.runSelfCheck();
		OuterWheels outerwheels = new OuterWheels();
		outerwheels.runSelfCheck();
		PIXL pixl = new PIXL();
		pixl.runSelfCheck();
		RIMFAX rimfax = new RIMFAX();
		rimfax.runSelfCheck();
		RobotArm robotarm = new RobotArm();
		robotarm.runSelfCheck();
		SHERLOC sherloc = new SHERLOC();
		sherloc.runSelfCheck();
		SuperCam supercam = new SuperCam();
		supercam.runSelfCheck();
		WATSON watson = new WATSON();
		watson.runSelfCheck();
		Wheels wheels = new Wheels();
		wheels.runSelfCheck();
	}

}
