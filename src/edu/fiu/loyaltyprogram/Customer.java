package edu.fiu.loyaltyprogram;

import java.util.Scanner;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Customer implements SelfCheckCapable {
	/**
	* The customer class holds the customer data
	* like name address and phone number.
	*/
	
	String name;
	String address1;
	String address2;
	String city;
	String state;
	Integer zip;
	String phone_num;
	String email;
	
	void setName() {		
	System.out.println("What is the customer name? ");
    @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	name = in.next();
			
	}
	public String getName() {
		return name;
	}
	void setAddress() {
		
	}
	public String getAddress() {
		String address = address1 + address2;
		return address;
	}
	void setPhoneNum() {
		
	}
	public String getPhoneNumber() {
		return phone_num;
	}
	void setEmail() {
		
	}
	public String getEmail() {
		return email;
	}
	void openMembershipAccount() {
		
	}
	void closeMembershipAccount() {
		
	}
	void updateMembershipAccount() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Customer system";
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
