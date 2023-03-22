package exam;

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
