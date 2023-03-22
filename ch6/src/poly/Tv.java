package poly;

//다형성(polymorphism) : 여러가지 형태를 가질 수 있는 능력
//					    상속일때만 가능

public class Tv {
	String color;
	boolean power;
	int chanel;
	
	void power() {
		power=!power;
	}
	void chanelUp() {
		chanel++;
	}
	void chanelDown() {
		chanel--;
	}
	
}
