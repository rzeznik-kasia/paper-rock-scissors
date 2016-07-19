package prsGame;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GestureFactory {
	String gestureString = "";
	Set<String> gestureStrings = new TreeSet<>();
	
	
	public GestureFactory() {
		gestureStrings.add(Stone.getGesture());
		gestureStrings.add(Paper.getGesture());
		gestureStrings.add(Scissors.getGesture());
		//add more if some other class extends Thing

	}

	public String getAvailableGestures() {
		Iterator<String> iter = gestureStrings.iterator();
		while (iter.hasNext()) {
			gestureString += iter.next();
			if (iter.hasNext())
				gestureString += ", ";
		}
		
		return gestureString;
	}

}
