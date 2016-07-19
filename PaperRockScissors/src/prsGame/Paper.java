package prsGame;

import java.util.Collection;
import java.util.HashSet;

public class Paper extends Thing {
	static final String name = "paper";
	static final char gesture = '|';
	static Collection<Thing> weakerThings = new HashSet<>();
	
	public Paper() {
		super(Paper.name);
		addWeakerThings(new Stone());
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
	

}
