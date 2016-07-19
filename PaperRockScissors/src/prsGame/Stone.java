package prsGame;

import java.util.Collection;
import java.util.HashSet;

public class Stone extends Thing {
	static final String name = "stone";
	static final char gesture = 'O';
	static Collection<Thing> weakerThings = new HashSet<>();
	
	public Stone() {
		super(Stone.name);
	}

	static private void addWeakerThings(Thing thing) {
		weakerThings.add(thing);
	}

	public static String getGesture() {
		return name + " " + gesture;
	}

	@Override
	Collection<Thing> getWeakerThings() {
		return weakerThings;
	}

	static {
		addWeakerThings(new Scissors());
	}
	
}
