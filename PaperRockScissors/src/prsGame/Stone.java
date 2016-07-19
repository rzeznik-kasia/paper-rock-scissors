package prsGame;

import java.util.Collection;

public class Stone extends Thing {

	public static String getGesture() {
		
		return "stone O";
	}

	@Override
	Collection<Thing> getWeakerThings() {
		// TODO Auto-generated method stub
		return null;
	}

}
