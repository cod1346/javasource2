package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		
		CalcThread calcThread = new CalcThread();
		CalcThread2 calcThread2 = new CalcThread2();
		
		calcThread2.setPriority(10);
		calcThread.setPriority(1);
		
		System.out.println("- 우선순위 "+calcThread.getPriority());
		System.out.println("| 우선순위 "+calcThread2.getPriority());
		
		calcThread.start();
		calcThread2.start();
		
		
	}

}
