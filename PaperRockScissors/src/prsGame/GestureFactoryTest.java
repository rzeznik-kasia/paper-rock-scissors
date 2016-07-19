package prsGame;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;


public class GestureFactoryTest {
	private GestureFactory gf;

	@Before
	public void initialize(){
		gf = new GestureFactory();
		gf.gestureStrings = new TreeSet<>();
	}
	
	@Test
	public void shouldSayStoneContaingAStone() {
		gf.gestureStrings.add(Stone.getGesture());
		assertEquals("stone O", gf.getAvailableGestures());	
	}
	
	@Test
	public void shouldSayPaperStoneContaingAPaperStone() {
		gf.gestureStrings.add(Paper.getGesture());
		gf.gestureStrings.add(Stone.getGesture());
		assertEquals("paper |, stone O", gf.getAvailableGestures());	
	}
	
	@Test
	public void shouldSayPaperStoneContaingAStonePaper() {
		gf.gestureStrings.add(Stone.getGesture());
		gf.gestureStrings.add(Paper.getGesture());
		assertEquals("paper |, stone O", gf.getAvailableGestures());	
	}
	
}
