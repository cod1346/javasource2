package inheritance;

public class SubListString extends ListString {

	String name = "성춘향";
	
	@Override
	public void list() {
		super.list();
		System.out.println(name+" 하위 클래스 이름");
	}
	
	
	public void writer() {
		System.out.println(name+" 하위 클래스 이름");
		System.out.println(super.name+" 상위 클래스 이름");
	}
	
	
}
