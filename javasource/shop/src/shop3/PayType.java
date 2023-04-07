package shop3;

// 열거타입 enum
// 한정된 값만을 갖는 데이터 타입

// 결제 시 카드, 현금만 허용
public class PayType {
	private int payNo;
	private String info;

	public PayType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayType(int payNo, String info) {
		super();
		this.payNo = payNo;
		this.info = info;
	}
	@Override
	public String toString() {
		return "PayType [payNo=" + payNo + ", info=" + info + "]";
	}
	public int getPayNo() {
		return payNo;
	}
	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
