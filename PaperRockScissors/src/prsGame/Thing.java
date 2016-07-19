package prsGame;

import java.util.Collection;

public abstract class Thing {
	String name;
	
	public Thing(String name) {
		this.name = name;
	}

	public Boolean isStrongerThan(Thing other) {
		return getWeakerThings().contains(other);
	}
	
	abstract Collection<Thing> getWeakerThings();
	
}
