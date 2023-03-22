package inheritance;

public class CheckingAccoung extends Account {
	
	private String cardNo;
	
	
	
	// 체크카드 기능 추가
	public CheckingAccoung(String no, String owner, int balance,String cardno) {
		super(no, owner, balance);
		this.cardNo = cardno;
	}

	//체크카크 사용액을 지불한다
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은경우 사용액을 지불
	//카드번호 일치한지 확인
	
	//은행잔고보다 크거나 카드번호가 일치하지 않으면 지불불가 메세지 출력
	
	 // 사용액
	
	int pay(String cardNo,int amount) {
		if (!this.cardNo.equals(cardNo)||getBalance()<amount) {
			System.out.println("카드번호나 잔액을 확인해 주세요");
			return 0;
		} else if(this.cardNo.equals(cardNo)&&getBalance()>amount)
			setBalance(getBalance()-amount);
			return getBalance();
		
	}
	
	
	
	
	
	
	
}
