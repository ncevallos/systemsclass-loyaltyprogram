package edu.fiu.loyaltyprogram;

import java.util.Date;
import java.util.Scanner;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Transactions implements SelfCheckCapable {

	Date date;
	Double txAmount;

	void processTransaction() {
		/*
		 * code for processing the transactions 
		 */
		System.out.println("Would you like to use your points for this transaction? (yes/no)");
        Scanner in = new Scanner(System.in);
		String input = in.next();
		if(input.equals("yes")) {
			System.out.println("Points used");
			System.out.println("Transaction complete");
			
		}
		else if(input.equals("no")) {
//			System.out.println("Cash or Credit");
			System.out.println("Credit Transaction selected");
			System.out.println("Transaction complete");
			
		}
		else {
			System.out.println("Transaction complete");
		}
	}	
	
	void voidTransaction() {
		/*
		 * Cancel transaction
		 */
		
	}
	
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Transactions system";
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
