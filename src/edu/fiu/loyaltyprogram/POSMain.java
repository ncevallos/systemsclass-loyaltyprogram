/**
 * 
 */
package edu.fiu.loyaltyprogram;

import java.util.Date;

/**
 * @author ncevallos
 *
 */
public class POSMain {

	Integer table;
	Date datetime;
	
	/**
	 * prints Welcome Message; this method is for demo purposes not on the class diagram
	 */
	public static void welcomeMessage() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Enya Asian Bistro");
	}
	
	void openTicket() {
		
	}
	void closeTicket() {
		
	}
	void cancelTicket() {
		
	}
	void addItem() {
		
	}
	void removeItem() {
		
	}
	void checkout() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeMessage();
		System.out.println("Placing a new order for: ");
		Customer customer = new Customer();
//		customer.runSelfCheck();
		customer.setName();
		System.out.println("Hello "+ customer.getName());
		TicketItems ticketitems = new TicketItems();
		ticketitems.addItem();
		Ticket ticket = new Ticket();
		System.out.println("Your total is ");
		System.out.println(ticket.calculateTotal());
		Membership membership = new Membership();
		System.out.println("Membership ID number is " + membership.getMembershipID());
		System.out.println("Is membership active - " + membership.checkStatus());
		Wallet wallet = new Wallet();
		System.out.println("Point Balance is - " + wallet.getPoints());
		Tier tier = new Tier();
		System.out.println("Membership Tier is  - " + tier.getName());
		Transactions transaction = new Transactions();
		transaction.processTransaction();
		
	}

}
