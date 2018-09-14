package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testSom() {
		int x = 1;
		int y = 3;
		
		int som = x+y;
		assertTrue(som==4);
	}

	@Test
	void testSub() {
		int x = 1;
		int y = 5;
		
		int sub = y-x;
		assertTrue(sub==4);
	}

	@Test
	void testDiv() {
		int x = 15;
		int y = 3;
		
		int div = x/y;
		assertTrue(div==5);
	}

	@Test
	void testMult() {
		int x = 5;
		int y = 3;
		
		int mul = x*y;
		assertTrue(mul==15);
	}

}
