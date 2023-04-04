package poly;

public class PruductEx {

	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		
		Tv1 tv1 = new Tv1();
		buyer.buy(tv1);
		// ==
		buyer.buy(new Tv1());
		
		
		
		Computer computer = new Computer();
		buyer.buy(computer);
		buyer.buy(new Computer());
		
		
		System.out.println("현재 남은 돈은 : "+buyer.money+"만원 입니다.");

		
		System.out.println("현재 보너스 점수는 : "+buyer.bonusPoint+"점 입니다.");
		
		
		
		
	}

}
