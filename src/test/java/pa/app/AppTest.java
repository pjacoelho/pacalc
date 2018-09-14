package pa.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 
{
	private static Logger logger = Logger.getLogger(App.class.getName());
	@BeforeEach 
	public void init() {
		logger.info("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
    	App.main(null);
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		assertEquals("Hello world!", res);
	}	
}
