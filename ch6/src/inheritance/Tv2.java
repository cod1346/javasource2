package inheritance;

//this(), this.변수명 : 자기자신의 것
//super(), super.변수명 : 부모
public class Tv2 {
	boolean power;
	int chanel;
	
	
//	public Tv2() {
//		super();
//	}
	
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
