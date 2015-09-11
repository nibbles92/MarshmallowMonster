package marshmallow.Controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster dylanMonster;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "";
		int eyes = 0;
		int noses = 0;
		double legs = 0.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		myDisplay = new MonsterDisplay();
		dylanMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair);
	}
	
	public void start()
	{
		myDisplay.displayInfo(dylanMonster.toString());
	}

}
