package prsGame;


public class Player {
	final String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Player(String name) {
		this.name = name;
	}

	public Thing getGesture(String message) {
		String str = "";
		str = ScanerFacade.handleGestureInput(message); // wyswietl wiadoomsc i pobierz jakim obiektem bedzie gral gracz

		return GestureFactory.createThingFromGesture(str);
	}


	
	
}
