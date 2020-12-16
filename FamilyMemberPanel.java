package finalProject241;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FamilyMemberPanel extends JPanel {
	
	//declare enumeration elements
	public enum familyMembers {Zero, One, Two, Three, NA}
	
	//declare variables
	protected JRadioButton Zero, One, Two, Three;
	private ButtonGroup famBG;
	familyMembers familyCount;
	
	//no-args constructor
	public FamilyMemberPanel() {
	
		//set the layout of the panel
		setLayout(new GridLayout(0,3));
		
		//define what each button means
		Zero = new JRadioButton("Zero");
		One = new JRadioButton("One");
		Two = new JRadioButton("Two");
		Three = new JRadioButton("Three");
		
		//create the button group
		famBG = new ButtonGroup();
		
		//add the buttons to the group
		famBG.add(Zero);
		famBG.add(One);
		famBG.add(Two);
		famBG.add(Three);
		
		//add the buttons to the panel 
		add(Zero);
		add(One);
		add(Two);
		add(Three);
		
		
	}
	
	/**
	 * method used to set the number of family members
	 * @param FN
	 */
	public void setFamilyNum(String FN) {
		
		if (FN.equals("Zero")) {
			
			familyCount = familyMembers.Zero;
		}
		else if (FN.equals("One")) {
			
			familyCount = familyMembers.One;
		}
		else if (FN.equals("Two")) {
			
			familyCount = familyMembers.Two;
		}
		else if (FN.equals("Three")) {
			
			familyCount = familyMembers.Three;
		}
		else {
			
			familyCount = familyMembers.NA;
		}
	}
	
	/**
	 * method used to get the user's answer for how many other clan members they have
	 * @return
	 */
	public String getFamilyCount() {
		
		if (Zero.isSelected())
		{
			return "Zero";
		}
		else if (One.isSelected())
		{
			return "One";
		}
		else if (Two.isSelected())
		{
			return "Two";
		}
		else if (Three.isSelected())
		{
			return "Three";
		}
		else {
			return "NA";
		}
	}
}
