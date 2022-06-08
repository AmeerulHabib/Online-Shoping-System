package shoppingSystem.actor;

import javax.swing.*;

public class DebugActor {
	public static void main(String[] args) {
		
		Customer user1 = new Customer();
		
		JFrame g = new JFrame("Login Session");
		
		//*
		JFrame f = new JFrame("Sign in Session");
		
		JOptionPane.showMessageDialog(f, "Welcome to the OOP Virtual Shooping"
				+ "\nEnter the details to sign up for an account",
				"Sign up Session",JOptionPane.INFORMATION_MESSAGE);
		
		user1.setName(JOptionPane.showInputDialog(f,"Enter Name","Ali bin Abu"));
		user1.setBillingAddress(JOptionPane.showInputDialog(f,"Enter Billing Address","N28 UTM"));
		
		int a = JOptionPane.showConfirmDialog(f,"Is the Shipping Address the same as Billing Address?");  
		
	    if(a == JOptionPane.YES_OPTION){  
		    user1.setDefaultShippingAddress(user1.getBillingAddress());  
		}
	    else if(a == JOptionPane.NO_OPTION) {
	    	user1.setDefaultShippingAddress(JOptionPane.showInputDialog(f,"Enter Default Shipping Address","KDOJ UTM"));
	    }
	    else if(a == JOptionPane.CANCEL_OPTION) {
	    	System.out.println("Cancel button is press");
	    	System.out.println();
	    }
	    else if(a == JOptionPane.CLOSED_OPTION) {
	    	System.out.println("Closed button is press");
	    	System.out.println();
	    }
		
	    int id = 1;
		user1.setId(id);
		user1.setEmail(JOptionPane.showInputDialog(f,"Enter email for verification","gmail"));
		user1.setPassword(JOptionPane.showInputDialog(f,"Set account Password","pass"));
		
	    
	    System.out.println("User name: " + user1.getName());
	    System.out.println("User Billing Address: " + user1.getBillingAddress());
		System.out.println("User Default Shipping Address: " + user1.getDefaultShippingAddress());
		
		System.out.println("User id: " + user1.getId());
	    System.out.println("User email: " + user1.getEmail());
		System.out.println("User password: " + user1.getPassword());
		//*/
		
		JOptionPane.showMessageDialog(g, "Welcome to the OOP Virtual Shooping"
				+ "\nEnter the login details to start shopping",
				"Login Session",JOptionPane.INFORMATION_MESSAGE);
		
		Customer user0 = new Customer();
		user0.setName(JOptionPane.showInputDialog(f,"Enter Name","Ali bin Abu"));
		
		
		//String name = JOptionPane.showInputDialog(g,"Enter name");
		//String user = user1.getName();
		
		//Customer user3 = new Customer("test");
		//Customer user4 = new Customer("test");
		if(user1.equals(user0))
			System.out.println("user is valid");
		else {
			System.out.println("Invalid");
		}
		
	}
	
}
