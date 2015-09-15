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
	
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterNoses()
	{
		return monsterNoses;
	}
	
	public double getMonsterLegs()
	{
		return monsterLegs;
	}
	
	public double getmMonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getMonsterBellyButton()
	{
		return monsterBellyButton;
	}
	
	public void setmonsterNoses()
	{
		this.monsterNoses = monsterNoses;
	}
	
	public void setmonsterBellyButton()
	{
		this.monsterBellyButton = monsterBellyButton;
	}
	
	public void setmonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setmonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setmonsterEyes(int monsterEyes)
	{
		this.monsterEyes = monsterEyes;
	}
	
	public String toString()
	{
		String monsterInfo = "My monster has " + monsterLegs + "legs and its' name is " + monsterName + " my monster also has " 
		+ monsterEyes + " eyes " + monsterNoses + " Nose " + monsterLegs + " legs " + monsterHair + " hair";
		
		return monsterInfo;
	}
}
