package inheritance;

public class CheckingAccoung2 {

	public static void main(String[] args) {
		CheckingAccoung checkingAccoung = new CheckingAccoung("110-10","홍길동", 100000, "4444-5555");
		
		
		checkingAccoung.pay("3333-5555",50000);
		
		int balance = checkingAccoung.pay("4444-555", 50000);
		System.out.println("사용 후 잔액"+balance);
		
		System.out.println(checkingAccoung.getBalance());
	}

}
