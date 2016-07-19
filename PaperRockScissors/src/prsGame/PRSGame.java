package prsGame;


public class PRSGame {

	public static void main(String[] args) {
		String message = "Pierwszy gracz podaje imię: ";
		String name = ScanerFacade.handlInput(message);
		Player p1 = new Player(name);
		GestureFactory gf = new GestureFactory();
		
		message = "Drugi gracz podaje imię: ";
		name = ScanerFacade.handlInput(message);
		Player p2 = new Player(name);
		
		message = "Pierwszy gracz podaje znak jakim będzie grał ("
				+ gf.getAvailableGestures() + "): ";
		System.out.println(message);
		
	}

}
