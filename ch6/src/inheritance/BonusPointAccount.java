package inheritance;

public class BonusPointAccount extends Account{
	//은행 + 보너스 포인트
	//보너스 포인트 = 예금액 * 1%
	int bonusPoint;

	public BonusPointAccount(String no, String owner, int balance,int bonusPoint) {
		super(no, owner, balance);
		this.bonusPoint = bonusPoint;
		// TODO Auto-generated constructor stub
	}
	
	//예금기능,
	//보너스포인트 +=예금액*1%
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		
		bonusPoint+=(double)amount*0.01;
		
	}
	
	
	
	
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	
}
