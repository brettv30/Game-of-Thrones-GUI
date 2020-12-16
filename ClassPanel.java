package finalProject241;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ClassPanel extends JPanel {
	
	//declare variables
	private JRadioButton Bastardy;
	private JRadioButton Noble_House;
	private JRadioButton King;
	private JRadioButton Ward;
	private JRadioButton Smallfolk;
	private JRadioButton Mercenary;
	private JRadioButton Lordship;
	private ButtonGroup classBG;
	
	//no args constructor
	public ClassPanel() {
		
		//set the layout of the sub panel
		setLayout(new GridLayout(7,1));
		
		//define what each button means
		Bastardy = new JRadioButton("Bastardy");
		Noble_House = new JRadioButton("Noble House");
		King = new JRadioButton("King");
		Ward = new JRadioButton("Ward");
		Smallfolk = new JRadioButton("Smallfolk");
		Mercenary = new JRadioButton("Mercenary");
		Lordship = new JRadioButton("Lordship");
		
		//create the button group
		classBG = new ButtonGroup();
		
		//add the buttons to the button group
		classBG.add(Bastardy);
		classBG.add(Noble_House);
		classBG.add(King);
		classBG.add(Ward);
		classBG.add(Smallfolk);
		classBG.add(Mercenary);
		classBG.add(Lordship);
		
		//set the border/title of the sub panel 
		setBorder(BorderFactory.createTitledBorder("Select Class"));
		
		//add the buttons to the sub panel 
		add(Bastardy);
		add(Noble_House);
		add(King);
		add(Ward);
		add(Smallfolk);
		add(Mercenary);
		add(Lordship);
		
	}
	
	/**
	 * method used to return the clan name
	 * @return
	 */
	public String getClassName() {
	
		if(Bastardy.isSelected())
		{
			return "Bastardy";
		}
		else if (Noble_House.isSelected())
		{
			return "Noble House";
		}
		else if (King.isSelected())
		{
			return "King";
		}
		else if (Ward.isSelected())
		{
			return "Ward";
		}
		else if (Smallfolk.isSelected())
		{
			return "Smallfolk";
		}
		else if (Mercenary.isSelected())
		{
			return "Mercenary";
		}
		else if (Lordship.isSelected())
		{
			return "Lordship";
		}
		else
		{
			return "NA";
		}
	}
	

}
