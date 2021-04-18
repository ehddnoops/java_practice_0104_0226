package chapter10;

public class AccountEx {
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.deposit(10000);
		System.out.println("¿¹±Ý¾×" + acc.getBalance());
		
		
		try {
			acc.withdraw(30000);
		} catch (BankInsufficientException e) {
			
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			e.printStackTrace();
		}
	}

}
