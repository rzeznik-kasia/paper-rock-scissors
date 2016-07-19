package prsGame;


public class PRSGame {

	public static void main(String[] args) {
		int gameCount = 3;
		GestureFactory.gestureInit();
		String message = "Pierwszy gracz podaje imię: ";
		String name = ScanerFacade.handleNameInput(message); // pobiera imie 1 gracza
		Player p1 = new Player(name);
		
		message = "Drugi gracz podaje imię: ";
		name = ScanerFacade.handleNameInput(message);
		Player p2 = new Player(name);
		
		
		while (gameCount > 0) {
			message = p1.getName() + " podaje znak jakim będzie grał ("
					+ GestureFactory.getAvailableGestures() + "): "; // wyswietla mozliwe znaki do wyboru
			Thing user1Thing = p1.getGesture(message);
			
			message = p2.getName() + " podaje znak jakim będzie grał ("
					+ GestureFactory.getAvailableGestures() + "): ";
			Thing user2Thing = p2.getGesture(message);
			
			
			if (user1Thing.isStrongerThan(user2Thing)) {
				// gra koczy sie natychmiast gdy ktorys z graczy ma 'silniejszy' gest
				System.out.println("Koniec gry. Wygral gracz " + p1.getName());
				return;
			}
			else if (user2Thing.isStrongerThan(user1Thing)) {
				System.out.println("Koniec gry. Wygral gracz " + p2.getName());
				return;
			}
			else {
				System.out.println("remis");
				gameCount--;
				if (gameCount == 0) { // gra konczy sie po 3 rundach
					System.out.println("Koniec gry. Remis");
				}
			}
		
		}	
	}

}
