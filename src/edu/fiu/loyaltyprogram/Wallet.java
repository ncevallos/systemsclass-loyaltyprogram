package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Wallet implements SelfCheckCapable {
	
	Integer pointsBalance = 9000;
	
	/**
	 *return points balance
	 */
	 public Integer getPoints() {
		return pointsBalance;
		 
	 }
	 /**
	 * increases Points Balance
	 */
	 void increasePoints( int amount) {
		 pointsBalance =+ amount;
					 
			 
	}
	 /**
	 * decreases Points Balance
	 */
	 void decreasePoints( int amount) {
		 pointsBalance =- amount;
					 
			 
	}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wallet system";
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