package prsGame;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GestureFactory {
	static String gestureString;
	static Set<String> gestureStrings = new TreeSet<>();

	public static void gestureInit() {
		gestureStrings.add(Stone.getGesture());
		gestureStrings.add(Paper.getGesture());
		gestureStrings.add(Scissors.getGesture());
		//add more if some other class extends Thing
	}

	public static String getAvailableGestures() {
		gestureString = "";
		Iterator<String> iter = gestureStrings.iterator();
		while (iter.hasNext()) {
			gestureString += iter.next();
			if (iter.hasNext())
				gestureString += ", ";
		}
		
		return gestureString;
	}

	public static Thing createThingFromGesture(String str) {
		if (str.equals("X")) {
			return new Scissors();
		} else if (str.equals("O")) {
			return new Stone();
		} else if (str.equals("|")) {
			return new Paper();
		} else
			return null;
	}

}
