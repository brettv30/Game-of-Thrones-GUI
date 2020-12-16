package finalProject241;

//KingdomBackgroundInfo inherits everything from KingdomPanel
public class KingdomBackgroundInfo extends KingdomPanel {
	
	//declare enumeration elements
	public enum kingdoms {North, Vale, Stormlands, Reach, Westerlands, Iron_Islands, Dorne, NA}
	public enum clans {Stark, Targaryen, Lannister, Greyjoy, Baratheon, Tyrell, Martell, Arryn, NA}
	public enum classes {Bastardy, NobleHouse, King, Ward, Smallfolk, Mercenary, Lordship, NA}
	
	//create enum variables
	classes className;
	kingdoms kingdomName;
	clans clanName;
	
	//no args constructor
	public KingdomBackgroundInfo() {
		
		kingdomName = kingdoms.NA;
		clanName = clans.NA;
		className = classes.NA;
	}
	
	/**
	 * method uset to set the kingdom's name
	 * @param k
	 */
	public void setKingdom(String k) {
		
		if (k.equals("North"))
		{
			kingdomName = kingdoms.North;
		}
		else if (k.equals("Vale"))
		{
			kingdomName = kingdoms.Vale;
		}
		else if (k.equals("Stormlands"))
		{
			kingdomName = kingdoms.Stormlands;
		}
		else if (k.equals("Reach"))
		{
			kingdomName = kingdoms.Reach;
		}
		else if (k.equals("Westerlands"))
		{
			kingdomName = kingdoms.Westerlands;
		}
		else if (k.equals("Iron Islands")) {
			
			kingdomName = kingdoms.Iron_Islands;
			
		}
		else if (k.equals("Dorne")) {
			
			kingdomName = kingdoms.Dorne;
		}
		else {
			
			kingdomName = kingdoms.NA;
		}
	}
	
	/**
	 * method used to set the clan's name
	 * @param cn
	 */
	public void setClan(String cn) {
		
		if (cn.equals("Stark"))
		{
			clanName = clans.Stark;
		}
		else if (cn.equals("Baratheon"))
		{
			clanName = clans.Baratheon;
		}
		else if (cn.equals("Targaryen"))
		{
			clanName = clans.Targaryen;
		}
		else if (cn.equals("Lannister"))
		{
			clanName = clans.Lannister;
		}
		else if (cn.equals("Greyjoy"))
		{
			clanName = clans.Greyjoy;
		}
		else if (cn.equals("Tyrell")) {
			
			clanName = clans.Tyrell;
			
		}
		else if (cn.equals("Martell")) {
			
			clanName = clans.Martell;
		}
		else if (cn.equals("Arryn")) {
			
			clanName = clans.Arryn;
		}
		else {
			
			clanName = clans.NA;
		}	
	}
	
	/**
	 * method used to set the class name 
	 * @param sc
	 */
	public void setClasses(String sc) {
		
		if (sc.equals("Bastardy"))
		{
			className = classes.Bastardy;
		}
		else if (sc.equals("Noble House"))
		{
			className = classes.NobleHouse;
		}
		else if (sc.equals("King"))
		{
			className = classes.King;
		}
		else if (sc.equals("Ward"))
		{
			className = classes.Ward;
		}
		else if (sc.equals("Smallfolk"))
		{
			className = classes.Smallfolk;
		}
		else if (sc.equals("Mercenary")) {
			
			className = classes.Mercenary;
			
		}
		else if (sc.equals("Lordship")) {
			
			className = classes.Lordship;
		}
		else {
			
			className = classes.NA;
		}	
	}
	
	/**
	 * method that returns the name of the kingdom
	 * @return
	 */
	public kingdoms getKingdomBigName() {
		
		return kingdomName;
		
	}
	
	/**
	 * method that returns the name of the clan
	 * @return
	 */
	public clans getClanName() {
		
		return clanName;
		
	}
	
	/**
	 * method that returns the name of the class
	 * @return
	 */
	public classes getClassName() {
		
		return className;
		
	}
}
