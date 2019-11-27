package finalProject241;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ClanPanel extends JPanel{
	
	//declare variables
	private JRadioButton Stark;
	private JRadioButton Targaryen;
	private JRadioButton Lannister;
	private JRadioButton Greyjoy;
	private JRadioButton Baratheon;
	private JRadioButton Tyrell;
	private JRadioButton Martell;
	private JRadioButton Arryn;
	private ButtonGroup clanBG;
	
	//no args constructor
	public ClanPanel() {
		
		// set the layout of the sub panel
		setLayout(new GridLayout(8,1));
		
		//define what each button means
		Stark = new JRadioButton("Stark");
		Targaryen = new JRadioButton("Targaryen");
		Lannister = new JRadioButton("Lannister");
		Greyjoy = new JRadioButton("Greyjoy");
		Baratheon = new JRadioButton("Baratheon");
		Tyrell = new JRadioButton("Tyrell");
		Martell = new JRadioButton("Martell");
		Arryn = new JRadioButton("Arryn");
		
		//create the button group
		clanBG = new ButtonGroup();
		
		//add the buttons to the group so only one can be chosen
		clanBG.add(Stark);
		clanBG.add(Targaryen);
		clanBG.add(Lannister);
		clanBG.add(Greyjoy);
		clanBG.add(Baratheon);
		clanBG.add(Tyrell);
		clanBG.add(Martell);
		clanBG.add(Arryn);

		//create a border/title for the panel of buttons
		setBorder(BorderFactory.createTitledBorder("Select Clan"));
		
		//add the buttons to the panel
		add(Stark);
		add(Targaryen);
		add(Lannister);
		add(Greyjoy);
		add(Baratheon);
		add(Tyrell);
		add(Martell);
		add(Arryn);
		
	}
	
	/**
	 * method used to return the clan name 
	 * @return
	 */
	public String getClanName() {
		
		if(Stark.isSelected())
		{
			return "Stark";
		}
		else if (Targaryen.isSelected())
		{
			return "Targaryen";
		}
		else if (Lannister.isSelected())
		{
			return "Lannister";
		}
		else if (Greyjoy.isSelected())
		{
			return "Greyjoy";
		}
		else if (Baratheon.isSelected())
		{
			return "Baratheon";
		}
		else if (Tyrell.isSelected())
		{
			return "Tyrell";
		}
		else if (Martell.isSelected())
		{
			return "Martell";
		}
		else if (Arryn.isSelected())
		{
			return "Arryn";
		}
		else
		{
			return "NA";
		}
	}

}
