package marshmallow.Controller;

import marshmallow.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster codyMonster;
	
	public MonsterController()
	{
		String name = "";
		int eyes = 0;
		int noses = 0;
		double legs = 0.0;
		double hair = 0.0;
		boolean hasBellyButton = false;
		
		codyMonster = new MarshmallowMonster(name, eyes, hasBellyButton, noses, legs, hair);
	}
}
