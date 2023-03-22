package poly;

public class PartTime extends Empoyee {

	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+" 이(가) 아르바이트 한다");
	}
	
	
	
}
