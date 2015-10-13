package marshmallow.Controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;
import marshmallows.view.Popup;


public class MonsterController
{
	private MarshmallowMonster dylanMonster; // Declares a Monster called dylanMonster.
	private MarshmallowMonster userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
    private Popup mypopup;
	
	public MonsterController()
	{
		String name = "Nibblous the Destroyer";
		int eyes = 26;
		int noses = 1;
		double legs = 4.5;
		double hair = 8.0;
		boolean hasBellyButton = true;
		
		mypopup = new Popup();
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		dylanMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(dylanMonster.toString());
		createUserMonster();
		myDisplay.displayInfo("User monster info: " + userMonster.toString());
	}
	
	private void makeMosterGui()
	{
		String name = mypopup.getAnswer("Type in your monster name.");
		
		mypopup.displayResponse("You typed in " + name);
		
		int eyes;
		String tempeyes = mypopup.getAnswer("How many eyes does your monster have?");
		
		while(!isInteger(tempeyes))
		{
			tempeyes = mypopup.getAnswer("Type in an interger value");
		}
		
		if(isInteger(tempeyes))
		{
			eyes = Integer.parseInt(tempeyes);
		}
		else
		{
			eyes = -1345452;
		}
		
		mypopup.displayResponse("You typed in " + eyes);
		int noses;
		String tempnoses = mypopup.getAnswer("How many noses does your monster have");
		
		while(!isInteger(tempnoses))
		{
			tempnoses = mypopup.getAnswer("Give me a valid integer value!");
		}
		
		if(isInteger(tempnoses))
		{
			noses = Integer.parseInt(tempnoses);
		}
		else
		{
			noses = -12678;
		}
		
		mypopup.displayResponse("You typed in " + noses);
		double legs;
		String templegs = mypopup.getAnswer("How many legs does your monster have?");
		
		while(!isDouble(templegs))
		{
			templegs = mypopup.getAnswer("Do a valid double value!!");
		}
		
		if(isDouble(templegs))
		{
			legs = Double.parseDouble((templegs));
		}
		else
		{
			legs = -.234523452345;
		}
		
		mypopup.displayResponse("You typed in " legs);
		
	}
	
	private void askQuestions()
	{
		System.out.println("I want a new name for a monster, type one please!");
		String newMonsterName = monsterScanner.next();
		dylanMonster.setMonsterName(newMonsterName);
		
		System.out.println("Give me a new number of noses!");
		int newMonsterNoses = monsterScanner.nextInt();
		dylanMonster.setmonsterNoses(newMonsterNoses);
		
		System.out.println("Also give me a new number of eyes.");
		int newMonsterEyes = monsterScanner.nextInt();
		dylanMonster.setmonsterEyes(newMonsterEyes);
		
		System.out.println("And a new pair of legs.");
		double newMonsterLegs = monsterScanner.nextDouble();
		dylanMonster.setmonsterLegs(newMonsterLegs);
		
		System.out.println("Some new hair strands would be nice.");
		double newMonsterHair = monsterScanner.nextDouble();
		dylanMonster.setmonsterHair(newMonsterHair);
		
		System.out.println("Now do i have a bellybutton True or False?");
		boolean newhasBellyButton = monsterScanner.nextBoolean();
		dylanMonster.setmonsterBellyButton(newhasBellyButton);
		
	
	}
	
	/**
	 * Creates a MarshmallowMonster instance from user put.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information
		System.out.println("What is your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		
		System.out.println("How many legs will it have? This is a decimal value.");	
		double userLegs;
		userLegs = monsterScanner.nextDouble();
		
		System.out.println("How much hair does it have, another decmal value");
		double userHair;
		userHair = monsterScanner.nextDouble();
		
		System.out.println("Does it have a belly button? True or False");
		boolean userBellyButton;
		userBellyButton = monsterScanner.nextBoolean();
		
		System.out.println("How many Eyes does it have?");
		int userEyes;
		userEyes = monsterScanner.nextInt();
		
		System.out.println("How many noses does it have?");
		int userNoses;
		userNoses = monsterScanner.nextInt();
		
		// Step Two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userBellyButton, userNoses, userLegs, userHair);
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
				
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			mypopup.displayResponse("You didn't type in a vaild interger!");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			mypopup.displayResponse("You did not type in a valid interger");
		}
		return isDouble;
	}

}
