/**
 * 
 */
package edu.fiu.loyaltyprogram;

import java.text.SimpleDateFormat;
import edu.fiu.sysdesign.SelfCheckUtils;


/**
 * The membership class extends the customer class and provides 
 * membership details of the customer's membership
 */
public class Membership extends Customer {
	Boolean active = true;
	SimpleDateFormat startDate = new SimpleDateFormat("15-11-2020");
	SimpleDateFormat expirationDate = new SimpleDateFormat("15-11-2021");
	
	/*
	 * membership ID implemented for demo purposes
	 */
	String membershipID = "C12345";
	


	
	 public Boolean checkStatus() {
		return active;
		 
	 }
	 /**
	 * returns the Membership ID
	 */
	 public String getMembershipID() {
		return membershipID;
		 
	 }
	 

		void setStartDate() {
			
		}
		
		public SimpleDateFormat getStartDate() {
			return startDate;
		}
	 /**
	 * sets the Expiration Date
	 */
	 void setExpirationdate() {
		 
	 }
	 public SimpleDateFormat getExpirationDate() {
		 return expirationDate;
	 }

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Membership system";
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
