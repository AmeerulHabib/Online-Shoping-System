package shoppingSystem.actor;

import javax.swing.*;

public class DebugClass {
	public static void main(String[] args) {
		Customer user1 = new Customer();
		
		JFrame f = new JFrame();
		
		user1.setName(JOptionPane.showInputDialog(f,"Enter Name"));
		user1.setBillingAddress(JOptionPane.showInputDialog(f,"Enter Billing Address"));
		
		int a=JOptionPane.showConfirmDialog(f,"Is the Shipping Address the same as billing Address?");  

		int id =1;
		user1.setId(id);
		user1.setEmail(JOptionPane.showInputDialog(f,"Enter email"));
		user1.setPassword(JOptionPane.showInputDialog(f,"Set Password"));
		
		
	    if(a==JOptionPane.YES_OPTION){  
		    user1.setDefaultShippingAddress(user1.getBillingAddress());  
		}
	    else if(a == JOptionPane.NO_OPTION) {
	    	user1.setDefaultShippingAddress(JOptionPane.showInputDialog(f,"Enter Default Shipping Address"));
	    }
	    else if(a == JOptionPane.CANCEL_OPTION) {
	    	System.out.println("Cancel button is press");
	    	System.out.println();
	    }
	    else if(a == JOptionPane.CLOSED_OPTION) {
	    	System.out.println("Closed button is press");
	    	System.out.println();
	    }
		
	    
	    System.out.println("User name: " + user1.getName());
	    System.out.println("User Billing Address: " + user1.getBillingAddress());
		System.out.println("User Default Shipping Address: " + user1.getDefaultShippingAddress());
		
		System.out.println("User id: " + user1.getId());
	    System.out.println("User email: " + user1.getEmail());
		System.out.println("User password: " + user1.getPassword());
		
	}
}
