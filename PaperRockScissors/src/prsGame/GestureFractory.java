package prsGame;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GestureFractory {

	
	public static String getAvailableGestures() {
		String gesturesString = "";
		Set<String> gestureStrings = new HashSet<>();
		Iterator<String> iter = gestureStrings.iterator();
		
		gestureStrings.add(Stone.getGesture());
		gestureStrings.add(Paper.getGesture());
		gestureStrings.add(Scissors.getGesture());
		
		while (iter.hasNext()) {
			gesturesString += iter.next();
			if (iter.hasNext())
				gesturesString += ", ";
		}
		
		return gesturesString;
	}

}
