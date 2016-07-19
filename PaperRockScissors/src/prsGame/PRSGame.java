package prsGame;


public class PRSGame {

	public static void main(String[] args) {
		int gameCount = 3;
		GestureFactory.gestureInit();
		String message = "Pierwszy gracz podaje imię: ";
		String name = ScanerFacade.handlNameInput(message);
		Player p1 = new Player(name);
		
		message = "Drugi gracz podaje imię: ";
		name = ScanerFacade.handlNameInput(message);
		Player p2 = new Player(name);
		
		
		while (gameCount > 0) {
			message = p1.getName() + " podaje znak jakim będzie grał ("
					+ GestureFactory.getAvailableGestures() + "): ";
			
			Thing user1Thing = p1.getGesture();
			Thing user2Thing = p2.getGesture();
			
			
			if (user1Thing.isStrongerThan(user2Thing)) {
				System.out.println("Koniec gry. Wygral gracz 1");
				return;
			}
			else if (user2Thing.isStrongerThan(user1Thing)) {
				System.out.println("Koniec gry. Wygral gracz 2");
				return;
			}
			else {
				System.out.println("remis");
				gameCount--;
				if (gameCount == 0) {
					System.out.println("Koniec gry. Remis");
				}
			}
		
		}	
	}

}
