package week6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Math2Test {

	Math m = new Math();
	
	@Test
	void testMultiplyReturnsCorrectValues() {
		int product = m.multiply(2, 5);
		assertEquals(10, product);
	}
	
}
