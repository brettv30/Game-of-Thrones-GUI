package finalProject241;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class OpeningWindow extends JFrame {

	//declare variables
	private WelcomePanel welcome;
	private NamePanel name;
	private ClanPanel clan;
	private KingdomPanel kingdom;
	private ClassPanel classes;
	private FamilyPanel family;
	private JButton messageButton, moveOnButton, clanButton, familyButton;
	private JLabel ClanLabel;
	private KingdomBackgroundInfo user;
	private FamilyMemberPanel otherUser;
	protected String userInfo;
	public ImageIcon image = new ImageIcon("/Users/brett/Downloads/WelcomeToWesteros.jpg");
	public ImageIcon image2 = new ImageIcon("/Users/brett/Downloads/ThanksForComing.jpeg");
	
	//define variables
	JLabel label = new JLabel(image);
	JLabel label2 = new JLabel(image2);
	
	//no-args constructor
	public OpeningWindow() {
		
		//Set the title for the entire program
		setTitle("The Seven Kingdoms");
		
		//set the layout for the entire program
		setLayout(new BorderLayout());
		
		//set the size of the window
		setSize(500, 500);
		
		//exits on close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//use this to put the window in the middle of the page
		setLocationRelativeTo(null);
		
		//define variables
		welcome = new WelcomePanel();
		messageButton = new JButton("Welcome Champion!");
		
		//add elements to the window
		add(welcome, BorderLayout.NORTH);
		add(messageButton, BorderLayout.SOUTH);
		add(label, BorderLayout.CENTER);
		
		//use a dialog box to call the toString in the WelcomePanel class
		JOptionPane.showMessageDialog(null, welcome.toString());
		
		//add an action listener to messageButton
		messageButton.addActionListener(new messageButtonListener());
	
		//so the user can see what the program is 
		setVisible(true);
		
	}

	//class that is used after the messageButton is pressed
	private class messageButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			//hide all of the elements on the page
			welcome.setVisible(false);
			messageButton.setVisible(false);
			label.setVisible(false);
			
			//define variables
			name = new NamePanel(null);
			moveOnButton = new JButton("Click here to move on");
			
			//add elements to the window, this also makes them visible
			add(name, BorderLayout.CENTER);
			add(moveOnButton, BorderLayout.SOUTH);
			
			//add an action listener to moveOnButton
			moveOnButton.addActionListener(new moveOnButtonListener());
			
		}
	}	
	
	//class that is used after the moveOnButton is pushed
	private class moveOnButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//hide the elements currently on the page
			name.setVisible(false);
			moveOnButton.setVisible(false);
			
			//define variables
			ClanLabel = new JLabel("Please select one from each category.");
			clan = new ClanPanel();
			kingdom = new KingdomPanel();
			classes = new ClassPanel();
			clanButton = new JButton("Click here to move on");
			
			//add elements to the window, this also makes them visible
			add(clan, BorderLayout.WEST);
			add(kingdom, BorderLayout.CENTER);
			add(classes, BorderLayout.EAST);
			add(ClanLabel, BorderLayout.NORTH);
			add(clanButton, BorderLayout.SOUTH);
			
			//add an action listener to clanButton
			clanButton.addActionListener(new clanButtonListener());
			
		}
	}
	
	//class that is used after the clanButton is pushed
	private class clanButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//hide all of the elements currently on the screen
			clan.setVisible(false);
			kingdom.setVisible(false);
			classes.setVisible(false);
			ClanLabel.setVisible(false);
			clanButton.setVisible(false);
			
			//define variables
			family = new FamilyPanel();
			familyButton = new JButton("Click here to move on");
			
			//add elements to the window, this also makes them visible
			add(family, BorderLayout.CENTER);
			add(familyButton, BorderLayout.SOUTH);
			
			//add an action listener to familyButton
			familyButton.addActionListener(new familyButtonListener());
			
		}
	}
	
	//this class is used after familyButton is pushed
	private class familyButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			//hide the current elements of the window
			family.setVisible(false);
			familyButton.setVisible(false);
			
			//add the second image to the window, this also makes it visible
			add(label2, BorderLayout.CENTER);
			
			//define variables
			user = new KingdomBackgroundInfo();
			otherUser = new FamilyMemberPanel();
			
			//set userInfo equal to the kingdom's name and then set the kingdom to that name
			userInfo = kingdom.getKingdomName();
			user.setKingdom(userInfo);	
			
			//set userInfo equal to the clan's name and then set the clan to that name
			userInfo = clan.getClanName();
			user.setClan(userInfo);
			
			//set userInfo equal to the classes name and then set the class to that name 
			userInfo = classes.getClassName();
			user.setClasses(userInfo);
			
			//set userInfo equal to the names returned in getFamilyCount then set the otherUser equal to that name 
			userInfo = family.famMemPanel.getFamilyCount();
			otherUser.setFamilyNum(userInfo);
			
			//use a dialog box to print out to the user everything they chose and their first name 
			JOptionPane.showMessageDialog(null,"You are " + name.firstNameBox.getText() + " of Clan " + user.clanName + ". You hail from the " + user.kingdomName + " Kingdom. You are a " 
					+ user.className + ". If you have any other clan members here are their names " + Arrays.deepToString(family.nameArray) + ".");
		}
	}
}
