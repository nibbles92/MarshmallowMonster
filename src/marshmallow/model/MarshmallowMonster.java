package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNoses;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBellyButton;
	

	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, boolean monsterBellyButton, int monsterNoses, double monsterLegs, double monsterHair)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterBellyButton = monsterBellyButton;
		this.monsterNoses = monsterNoses;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + "legs and its' name is " + monsterName + " my monster also has " 
		+ monsterEyes + " eyes " + monsterNoses + " Nose " + monsterLegs + " legs " + monsterHair + " hair";
		
		return monsterInfo;
	}
}
