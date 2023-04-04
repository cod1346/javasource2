package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {


		CreditLineAccount creditLineAccount = new CreditLineAccount("11-11","홍길동", 10000, 200000);
		
		System.out.println("사용액 : "+creditLineAccount.withdraw(50000));
		System.out.println("잔액 : "+creditLineAccount.getBalance());
		System.out.println();
		System.out.println("사용액 : "+creditLineAccount.withdraw(300000));
		System.out.println("잔액 : "+creditLineAccount.getBalance());
	}

}
