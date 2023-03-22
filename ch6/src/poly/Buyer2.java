package poly;

public class Buyer2 {
	int money=1000;
	int bonusPoint=0;
	
	Pruduct cart[] = new Pruduct[5];
	
	
	
	int i=0;

	void buy(Pruduct p) {
		if(money < p.price) {
		System.out.println("잔액 부족으로 물건을 구매할 수 없습니다.");
		return;
		}
		
		money -=p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"을/를 구매하셨습니다.");
	}
	
	
	void summary() {
		
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < cart.length; i++) {
			if (cart[i]==null) break;
			
			sum+= cart[i].price;
			itemList += cart[i]+",";
		}
		
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 입니다.");
		System.out.println("구입하신 물품은 "+itemList+" 입니다.");
			
		}
		
		
		
}
	
	
	
