package mainClass;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane extends WindowAdapter{
	
	static JFrame f;
	
	public OptionPane () {
		
		f=new JFrame("JOptionPane Sample");
		
		f.addWindowListener(this);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JButton button = new JButton("Click to Proceed");
		
	    ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				
				Component source = (Component) actionEvent.getSource();
				
				Object response = JOptionPane.showInputDialog(source,
				    "Choose One?", "Welcome to the OOP Virtual Shopping",
				    JOptionPane.QUESTION_MESSAGE, null, new String[] { "Sign in", "Login", "Exit" },
				    "Login");
				
				System.out.println("Response: " + response);
				
				if(response == "Sign in")
					System.out.println("Sign in Session");
				else if(response == "Login")
					System.out.println("Login Session");
				else if(response == "Exit") {
					System.out.println("Exiting");
					int a = JOptionPane.showConfirmDialog(f,"Are you sure?");  
					if(a == JOptionPane.YES_OPTION)  	
					    System.exit(0);  
				}
			}
	    };
	    
	    button.addActionListener(actionListener);
	    f.add(button, BorderLayout.CENTER);
	    f.setSize(300, 200);
	    f.setVisible(true);
	    
	}
	
	public void windowClosing(WindowEvent e) {  
		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
		
		if(a==JOptionPane.YES_OPTION){  
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		}  
	}
	
	
}