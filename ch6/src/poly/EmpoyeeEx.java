package poly;

public class EmpoyeeEx {

	public static void main(String[] args) {
		Empoyee empoyee = new Empoyee();
		empoyee.setName("홍길동");
		empoyee.setPosition("사원");
		
		Empoyee empoyee2 = new Ceo();
		empoyee2.setName("김동호");
		empoyee2.setPosition("CEO");
		
		Empoyee empoyee3 = new Adminstrator();
		empoyee3.setName("정우성");
		empoyee3.setPosition("Admin");
		
		Empoyee empoyee4 = new PartTime();
		empoyee4.setName("성춘향");
		empoyee4.setPosition("파트타임");
		
		empoyee.work();
		empoyee2.work();
		empoyee3.work();
		empoyee4.work();
		
		
		workPrint(empoyee);
		workPrint(empoyee2);
		workPrint(empoyee3);
		workPrint(empoyee4);
	}
	
	
	static void workPrint(Empoyee empoyee) {
		empoyee.work();
	}
}
