package prsGame;


public class PRSGame {

	public static void main(String[] args) {
		GestureFactory.gestureInit();
		String message = "Pierwszy gracz podaje imię: ";
		String name = ScanerFacade.handlNameInput(message);
		Player p1 = new Player(name);
		
		message = "Drugi gracz podaje imię: ";
		name = ScanerFacade.handlNameInput(message);
		Player p2 = new Player(name);
		
		message = p1.getName() + " podaje znak jakim będzie grał ("
				+ GestureFactory.getAvailableGestures() + "): ";
		
		Thing user1Thing = p1.getGesture();
		Thing user2Thing = p2.getGesture();
		
		Boolean b = user1Thing.isStrongerThan(user2Thing);
		
	}

}
