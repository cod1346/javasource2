package exam;

public class IpTv extends ColorTv {
	
	
	private String ip;
	
	public IpTv(int size, int color,String ip ) {
		super(size, color);
		this.ip = ip;
	}
	
	@Override
	public void printProperty() {
		System.out.println("나의 IpTv는"+super.getSize()+"인치,"+getColor()+"컬러,"
				+"주소는"+this.ip+"입니다");
	}
	
	
	
	
	
	
	
	
	
}
