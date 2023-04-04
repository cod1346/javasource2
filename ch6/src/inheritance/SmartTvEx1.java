package inheritance;

public class SmartTvEx1 {

	public static void main(String[] args) {
		SmartTv smart = new SmartTv();
		
		//상속여부 확인
		smart.chanel =10;
		smart.chanelUp();
		System.out.print("현재 채널 : "+smart.chanel);
		
		smart.power();
		System.out.println("전원 상태 : "+smart.power);
		
		smart.displayCaption("hello");
		smart.caption = true;
		smart.displayCaption("hello");


	}

}
