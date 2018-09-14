package pa.app;

import java.util.logging.Logger;

public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	
	private static Logger logger = Logger.getLogger(App.class.getName());
	public BankAccount(double b, double l, double lb){
		balance=b;
		limit=l;
		lowestBalance=lb;
	}
	
	public void withdraw(double amount){
		
			balance=balance-amount;
		
	}
	
	
	public void deposit(double amount){
		
		balance=balance+amount;
	}
	
	
	public double getBalance(){
		return balance;
	}
	
	public static void main(String[] args) {
		logger.info("Ola");
		BankAccount ba = new BankAccount(300,100,0);
		logger.info(String.valueOf(ba.getBalance()));
    	ba.withdraw(50);
    	logger.info(String.valueOf(ba.getBalance()));
    	ba.deposit(100);
    	logger.info(String.valueOf(ba.getBalance()));
    }

}
