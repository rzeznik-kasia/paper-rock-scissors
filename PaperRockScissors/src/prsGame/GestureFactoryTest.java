package prsGame;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;


public class GestureFactoryTest {

	@Before
	public void initialize(){
		GestureFactory.gestureStrings = new TreeSet<>();
	}
	
	@Test
	public void shouldSayStoneContaingAStone() {
		GestureFactory.gestureStrings.add(Stone.getGesture());
		assertEquals("stone O", GestureFactory.getAvailableGestures());	
	}
	
	@Test
	public void shouldSayPaperStoneContaingAPaperStone() {
		GestureFactory.gestureStrings.add(Paper.getGesture());
		GestureFactory.gestureStrings.add(Stone.getGesture());
		assertEquals("paper |, stone O", GestureFactory.getAvailableGestures());	
	}
	
	@Test
	public void shouldSayPaperStoneContaingAStonePaper() {
		GestureFactory.gestureStrings.add(Stone.getGesture());
		GestureFactory.gestureStrings.add(Paper.getGesture());
		assertEquals("paper |, stone O", GestureFactory.getAvailableGestures());	
	}
	
}
