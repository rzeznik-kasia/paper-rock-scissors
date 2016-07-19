package prsGame;

import java.io.Console;
import java.util.Scanner;

public class ScanerFacade {
	static Scanner scaner = new Scanner(System.in);
	
	public static String handleNameInput(String message) {	
		String name;
		while(true) {
			System.out.println(message);
			name = scaner.nextLine(); // odczytaj imie gracza
			if(!name.equals("")) break; // todo: when names are the same
		}
		return name;
	}

	// narazie taka sama jak handleNameInput
	public static String handleGestureInput(String message) {
		String name;
		while(true) {
			//Console c = System.console(); // moja konsola daje null
			//name = c.readLine("%s", message);
			// todo: zrobic cos zeby znaki nie byly widziane w consoli dla drugiego gracza
			
			System.out.println(message);
			name = scaner.nextLine(); // odczytaj obiekt kotrym gracz bedzie gral
			if(!name.equals("") && GestureFactory.allowed(name)) break;
		}
		return name;
	}

	
}
