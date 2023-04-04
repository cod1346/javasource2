package inheritance;

public class DmbCellPhone extends CellPhone {
	int chanel;
	
	void turnOnDmb() {
		System.out.println("채널 "+chanel+" 번 DMB 방송 시작");
	}
	void changeChanelDmb(int chanel) {
		this.chanel = chanel;
		System.out.println("채널"+this.chanel+" 번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("채널"+chanel+"번 DMB 방송 종료");
	}
}
