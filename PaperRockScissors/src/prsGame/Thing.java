package prsGame;

import java.util.Collection;

public abstract class Thing {
	String name;
	
	public Boolean isStrongerThan(Thing other) {
		return getWeakerThings().contains(other);
	}
	
	abstract Collection<Thing> getWeakerThings();
	
}
