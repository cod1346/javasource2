package poly;

public class Pruduct {
	int price;
	int bonusPoint;
	
	public Pruduct() {
		
	}
	//생성자
	public Pruduct(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
	
	
}
