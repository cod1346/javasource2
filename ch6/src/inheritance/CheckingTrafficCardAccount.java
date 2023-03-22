package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccoung{
	
	private boolean hasTrafficCard;
	
	
	public CheckingTrafficCardAccount(String no, String owner, int balance, String cardno, boolean hasTrafficCard) {
		super(no, owner, balance, cardno);
		this.hasTrafficCard = hasTrafficCard;
	}


	public CheckingTrafficCardAccount(String no, String owner, int balance, String cardno) {
		super(no, owner, balance, cardno);
	}
	
	
	//교통비 지불 (int payTrafficCard()
	//카드번호, 사용액 매개변수로 받아 교통카드 기능이 있다면 지불 처리
	//교통카드 기능이 없다면 "교통카드 기능이 없습니다" 메세지 출력
	
	int payTrafficCard(String cardno, int amount) {
		if (!hasTrafficCard) {
			System.out.println("교통카드 기능이 없습니다");
			return 0;
		}
		
		//카드번호 일치하고 잔액 있다면 지불 처리
		return pay(cardno, amount);
	}
	
	
	
}
