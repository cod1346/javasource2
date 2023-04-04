package thread;

public class BigLetters extends Thread{
	@Override
	public void run() {
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
	}
}
