package chapter10;

public class Account {
	
	private long balance;
	
	public Account() {
	
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) throws BankInsufficientException {
		if (balance<money) {
			throw new BankInsufficientException("�ܰ� ����" + (money-balance)+"���ڶ�");
		}
		
		balance = balance - money;
	}
	
	
	
	
	
	
	
}
