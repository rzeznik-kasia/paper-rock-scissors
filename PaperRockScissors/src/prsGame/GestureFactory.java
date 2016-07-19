package prsGame;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Klasa przedstawia obiekty rozszerzajace klase Thing, jesli klasa Thing zostanie rozszerzona
 * tę klase trzeba bedzie przede wszystkim uaktualnic.
 * @author kasia
 *
 */
public class GestureFactory {
	/**
	 *  gestureString - uzywany do wylistowania wszystkich mozliwych znakow, jakie uzytkownik moze wpisac
	 *  np.: kamien, nozyczki albo papier
	 */
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
	
	/**
	 * 
	 * @param str - wybor uzytkownika - ktorym obiektem bedzie gral w grze
	 * @return Thing - obiekt ktory zostal utworzony w zaleznosci od wyboru uzytkownika
	 */
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
	/**
	 * 
	 * @param name - wpisany przez uzytkownika znak musi reprezentowac obiekt ktroy istnieje
	 * @return - true jesli podany przez uzytkownika znak jest poprawny
	 *           false jesli podany przez uzytkownika znak jest niepoprawny
	 */
	public static boolean allowed(String name) {
		if (name.equals("X") || name.equals("O") || name.equals("|"))
			return true;
		else
			return false;
	}

}
