package finalProject241;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FamilyPanel extends JPanel {
	
	//declare variables
	private JLabel questionLabel;
	protected FamilyMemberPanel famMemPanel;
	protected String[] nameArray = new String[0];
	
	//no args constructor
	public FamilyPanel() {
		
		//set the layout of the panel 
		setLayout(new BorderLayout());
		
		//define the elements 
		questionLabel = new JLabel("How many other clan members are there?");
		famMemPanel = new FamilyMemberPanel();
		
		//add the elements to the panel 
		add(questionLabel, BorderLayout.NORTH);
		add(famMemPanel, BorderLayout.CENTER);
		
		//add action listeners to buttons Zero, One, Two, and Three
		famMemPanel.Zero.addActionListener(new ZeroButtonListener());
		famMemPanel.One.addActionListener(new OneButtonListener());
		famMemPanel.Two.addActionListener(new TwoButtonListener());
		famMemPanel.Three.addActionListener(new ThreeButtonListener());
		
	}
	
	//ZeroButtonListener that does literally nothing but I want it to be here
	private class ZeroButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	//if the button One is pushed then this class executes
	private class OneButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//use an array to store the name we get 
			nameArray = new String[1];
			
			for (int i = 0; i < nameArray.length; i++) {

				nameArray[i] = JOptionPane.showInputDialog("Enter Name Here");
			}
		}
	}
	
	//if the button Two is pushed then this class executes
	private class TwoButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//use an array to store the names we get 
			nameArray = new String[2];
			
			for (int i = 0; i < nameArray.length; i++) {
				
				nameArray[i] = JOptionPane.showInputDialog("Enter Name Here");
				
			}
		}
	}
	
	//if the button Three is pushed then this class executes
	private class ThreeButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//use an array to store the names we get 
			nameArray = new String[3];
			
			for (int i = 0; i < nameArray.length; i++) {
				
				nameArray[i] = JOptionPane.showInputDialog("Enter Name Here");
				
			}
		}
	}
}
