package finalProject241;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class KingdomPanel extends JPanel {
	
	//declare variables
	private  JRadioButton North;
	private  JRadioButton Vale;
	private  JRadioButton Stormlands;
	private  JRadioButton Reach;
	private  JRadioButton Westerlands;
	private  JRadioButton Iron_Islands;
	private  JRadioButton Dorne;
	private ButtonGroup kingdomBG;
	
	//no args constructor
	public KingdomPanel() {
		
		//set the layout of the sub panel 
		setLayout(new GridLayout(7,1));
		
		//determine what each button means
		North = new JRadioButton("North");
		Vale = new JRadioButton("Vale");
		Stormlands = new JRadioButton("Stormlands");
		Reach = new JRadioButton("Reach");
		Westerlands = new JRadioButton("Westerlands");
		Iron_Islands = new JRadioButton("Iron Islands");
		Dorne = new JRadioButton("Dorne");
		
		//create the button group
		kingdomBG = new ButtonGroup();
		
		//add the buttons to the button group
		kingdomBG.add(North);
		kingdomBG.add(Vale);
		kingdomBG.add(Stormlands);
		kingdomBG.add(Reach);
		kingdomBG.add(Westerlands);
		kingdomBG.add(Iron_Islands);
		kingdomBG.add(Dorne);
		
		//set the border/title of the panel of buttons
		setBorder(BorderFactory.createTitledBorder("Select Kingdom"));
		
		//add the buttons to the sub panel 
		add(North);
		add(Vale);
		add(Stormlands);
		add(Reach);
		add(Westerlands);
		add(Iron_Islands);
		add(Dorne);
		
	}
	
	/**
	 * method used to get the name of the kingdom 
	 * @return
	 */
	public String getKingdomName() {
		
		if(North.isSelected())
		{
			return "North";
		}
		else if (Vale.isSelected())
		{
			return "Vale";
		}
		else if (Stormlands.isSelected())
		{
			return "Stormlands";
		}
		else if (Reach.isSelected())
		{
			return "Reach";
		}
		else if (Westerlands.isSelected())
		{
			return "Westerlands";
		}
		else if (Iron_Islands.isSelected())
		{
			return "Iron Islands";
		}
		else if (Dorne.isSelected())
		{
			return "Dorne";
		}
		else
		{
			return "NA";
		}
	}
	
	
}
