package finalProject241;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NamePanel extends JPanel{
	
	//declare variables
	private JLabel introLabel;
	protected JTextField firstNameBox;
	
	//args constructor 
	public NamePanel(JTextField firstNameBox) {
		
		//set the layout of the name panel 
		setLayout(new GridLayout(2,0));
		
		//define the elements in the panel 
		introLabel = new JLabel("Enter your first name in the box below");
        firstNameBox = new JTextField(10);
		
		//an example of aggregation
        this.firstNameBox = firstNameBox;
		
        //add these elements to the panel 
		add(introLabel);
		add(this.firstNameBox);
		
	}
	

}
