package edu.fiu.loyaltyprogram;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class TicketItems implements SelfCheckCapable {

	
	Integer quantity;
	Double price;
	Double itemTotal;
	
	/*
	 * the string of items was implemented for the demo and is not on the class diagram
	 */
	String[] items = {"Tuna Tiradito", "Shrimp Tempura", "Sashimi-12pc"};
	
	void calculateItemTotal() {
		/*
		 * this is more in place if the quantity is greater than one
		 * the item total will then be the price * quantity
		 */
		itemTotal = quantity * price;
		
	}
	void applyPromo() {
		/*
		 * apply promo class is to apply a promo to an item, for instance 
		 * if there are happy hour drinks
		 */
		
	}
	void addItem() {
		/*
		 * add item to array, below was implemented for demo purposes
		 */
		for (var i = 0; i < items.length; i++) {
			System.out.println(items[i] +" ordered");
		}
		
	}
	void removeItem() {
		/*
		 * remove item from list/array
		 */
		
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Ticket Items system";
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
