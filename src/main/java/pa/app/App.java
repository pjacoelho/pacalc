package pa.app;

import java.util.logging.Logger;

public class App 
{
	private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	
    	logger.info( "Maven JUnit 5 - Hello World!" );
    }
	
	String concat(String s1, String s2) {
		return s1+s2;
	}
}
