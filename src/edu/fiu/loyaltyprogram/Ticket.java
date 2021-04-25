package edu.fiu.loyaltyprogram;


import java.util.Date;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Ticket implements SelfCheckCapable {
	String type;
	Date datetime;
	Double total;
	Double tip = 10.00;
	Double subtotal = 40.42;
	Double tax = 0.07;
	

	 void openTicket() {
				 
		 
	 }
	 void closeTicket() {
					 
			 
	}
	 void memberCheckout() {
		 /*
		  * this would check membership status
		  * and if active give the customer the 
		  * ability to check out with points
		  */
		 
	 }
	 void cancelTicket() {
		 
	 }
	 void calculateSubTotal() {
		 /*
		  * bring in item total from ticket items
		  */
	 }
	 public Double calculateTotal() {
		 total = tip + (subtotal * (1.00 + tax));
		 Double x = Math.floor(total * 100) / 100;
		 return x;
	 }
	 void addItem() {
		 
	 }
	 void removeItem(){
		 
	 }
	 void getTotal() {
		 
	 }
	 void nonMemberCheckout() {
		 
	 }
	 
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Ticket system";
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
