package inheritance;

public class Account {
	private String no;
	private String owner;
	private int balance;
	
	
	public Account(String no, String owner, int balance) {
		super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
	}
	
	//예금하다
	//void deposit(int amount) : 잔액 += 입금액
	void deposit(int amount) {
		this.balance+=amount;
	}
	
	
	
	
	//출금하다
	//int withdraw(int amount) : 잔액 -=출금액
	//잔액 > 출금액 경우만
	int withdraw(int amount) {
		if (this.balance>amount) {
			this.balance -=amount;
			return this.balance;
		} else if(this.balance<amount)
			System.out.println("잔액을 확인해 주세요");
			return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
