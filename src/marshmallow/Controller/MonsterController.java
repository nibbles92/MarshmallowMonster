package marshmallow.Controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster dylanMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "Nibblous the Destroyer";
		int eyes = 26;
		int noses = 1;
		double legs = 4.0;
		double hair = 8.0;
		boolean hasBellyButton = false;
		
		myDisplay = new MonsterDisplay();
		dylanMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(dylanMonster.toString());
	}

}
