package ch7;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account("110-10", "홍길동", 100000);
		
		
		account.withdraw(50000);
		System.out.println(account.balance);
		account.withdraw(500000);

	}

}
