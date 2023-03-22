package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount = new BonusPointAccount("11-11","서유기" , 0,100000);
		
		int amount = 100000;
		
		bonusPointAccount.deposit(amount);
		
		System.out.println("예금액 : "+amount);
		System.out.println("현재 보너스 포인트 : "+bonusPointAccount.getBonusPoint());
		
		
		
		System.out.println(bonusPointAccount.bonusPoint);
	}

}
