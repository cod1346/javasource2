package thread;

import java.util.Iterator;

public class SmallLetters extends Thread{
	@Override
	public void run() {
		
		for (char i = 97; i < 123; i++) {
			System.out.print(i);
		}
		
		
		
	}
}
