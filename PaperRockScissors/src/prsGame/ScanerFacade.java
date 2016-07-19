package prsGame;

import java.util.Scanner;

public class ScanerFacade {
	static Scanner scaner = new Scanner(System.in);
	public static String handlInput(String message) {	
		String name;
		
		while(true) {
			System.out.println(message);
			name = scaner.nextLine();
			if(!name.equals("")) break; // todo: when names are the same
		}
		return name;
	}
}
