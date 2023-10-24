package test;
import bad4debug.Place;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Quentin Rabilloud
 */

class PlaceTest {

	@Test
	void testPlace() {
		
		Place p1 = new Place();
		Assertions.assertEquals(0, p1.getTokens());
	}

	@Test
	void testPlaceInt() {
		int n = -2;
		Place p2 = new Place(n);
		Assertions.assertEquals(Math.abs(n), p2.getTokens());
	}

	@Test
	void testPlaceStringInt() {
		int n = 5;
		Place p3 = new Place(null, n);
		Assertions.assertEquals(n, p3.getTokens());
		Assertions.assertEquals("PLACE", p3.getName());
		Place p4 = new Place("TPlace", n);
		Assertions.assertEquals("TPlace", p4.getName());
	}
	
	@Test
	void testGetTokens() {
		int n = 3;
		Place p5 = new Place(n);
		Assertions.assertEquals(n, p5.getTokens());
	}

	@Test
	void testRemoveTokens() {
		int n = 7;
		
		int j = 5;
		Place p6 = new Place(n);
		p6.removeTokens(j);
		Assertions.assertEquals((n-j), p6.getTokens());
		
		int k = -2;
		Place p7 = new Place(n);
		p7.removeTokens(k);
		Assertions.assertEquals(0, p7.getTokens());
		
		int l = 14;
		Place p8 = new Place(n);
		p8.removeTokens(l);
		Assertions.assertEquals(0, p8.getTokens());
	}

	@Test
	void testToString() {
		int n = 5;
		Place p9 = new Place(n);
		String expectedName = "Place: " + p9.getName() + " = " + n + "\n";
		Assertions.assertEquals(p9.toString(), expectedName);
	}

}
