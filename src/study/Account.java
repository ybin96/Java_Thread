package study;

public class Account {
	private int balance;
	
	public synchronized void deposit(int amount) { //입금
		balance += amount; 
	}

	public int getBalance() {
		return balance;
	}
	
	
}
