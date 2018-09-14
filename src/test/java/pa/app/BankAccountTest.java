package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	private static Logger logger = Logger.getLogger(App.class.getName());
	public BankAccount ba;
	
    @BeforeAll
    static void beforeAll() {
    	logger.info("Inicializa��es Globais");
    }
 
    @BeforeEach
    void beforeEach() {
    	logger.info("Inicializa��o do BankAccount");
        ba=new BankAccount(300,100,0);
    }

	@Test
	void testWithdraw() {
		ba.withdraw(50);
		logger.info(String.valueOf(ba.getBalance()));
		assertTrue(ba.getBalance()==250);

	}

	@Test
	void testDeposit() {
		ba.deposit(100);
		logger.info(String.valueOf(ba.getBalance()));
		assertTrue(ba.getBalance()==400);
	}

	@Test
	void testGetBalance() {
		System.out.println(ba.getBalance());
	}

}
