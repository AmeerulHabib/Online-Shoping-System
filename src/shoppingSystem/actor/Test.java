package shoppingSystem.actor;

import java.util.Scanner;
import javax.swing.*;

public class Test {
	public static void main(String[] args) {
		Customer user1 = new Customer();
		
		/*
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter name: ");
		
		user1.setName(inp.nextLine());
		*/
		JFrame f = new JFrame();
		
		//user1.setName(JOptionPane.showInputDialog(f,"Enter Name"));
		String result =JOptionPane.showInputDialog(f,"Enter Billing Address");
	    
		System.out.println(result);
		/*
		user1.setBillingAddress(JOptionPane.showInputDialog(f,"Enter Billing Address"));
		
		int a=JOptionPane.showConfirmDialog(f,"Is the Shipping Address the same as billing Address?");  

	    if(a==JOptionPane.YES_OPTION){  
		    user1.setDefaultShippingAddress(user1.getBillingAddress());  
		}
	    else if(a == JOptionPane.NO_OPTION) {
	    	user1.setDefaultShippingAddress(JOptionPane.showInputDialog(f,"Enter Default Shipping Address"));
	    }
	    else if(a == JOptionPane.CANCEL_OPTION) 
	    	System.out.println("Cancelled");
	    else if(a == JOptionPane.CLOSED_OPTION)
	    	System.out.println("Closed");
	    */
		//System.out.println("Billing Address is: " + user1.getBillingAddress());
		//System.out.println("Default Shipping Address is: " + user1.getDefaultShippingAddress());
	}
}
