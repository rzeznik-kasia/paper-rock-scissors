package prsGame;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GestureFactory {
	static String gestureString;
	static Set<String> gestureStrings = new TreeSet<>();
	

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

	public static void gestureInit() {
		gestureStrings.add(Stone.getGesture());
		gestureStrings.add(Paper.getGesture());
		gestureStrings.add(Scissors.getGesture());
		//add more if some other class extends Thing
	}

}
