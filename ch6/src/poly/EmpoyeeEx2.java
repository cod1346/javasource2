package poly;

public class EmpoyeeEx2 {

	public static void main(String[] args) {
//		Empoyee empoyee = new Empoyee();
//		empoyee.setName("홍길동");
//		empoyee.setPosition("사원");
//		empoyee.work();
//		workPrint(empoyee);
//		
		Ceo empoyee2 = new Ceo();
		empoyee2.setName("김동호");
		empoyee2.setPosition("CEO");
		empoyee2.work();
		workPrint(empoyee2);
		
		Adminstrator empoyee3 = new Adminstrator();
		empoyee3.setName("정우성");
		empoyee3.setPosition("Admin");
		empoyee3.work();
		workPrint(empoyee3);
		
		PartTime empoyee4 = new PartTime();
		empoyee4.setName("성춘향");
		empoyee4.setPosition("파트타임");
		empoyee4.work();
		workPrint(empoyee4);
		
		
		
	}
	
	
	static void workPrint(Empoyee empoyee) {
		empoyee.work();
	}
}
