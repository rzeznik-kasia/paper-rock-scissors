package prsGame;

import java.util.Collection;
import java.util.HashSet;

public class Scissors extends Thing {
	static final String name = "scissors";
	static final char gesture = 'X';
	static Collection<Thing> weakerThings = new HashSet<>();
	
	public Scissors() {
		super(Scissors.name);
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
