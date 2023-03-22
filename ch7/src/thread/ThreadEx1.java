package thread;

public class ThreadEx1 {

	public static void main(String[] args) {

		SmallLetters smallLetters = new SmallLetters();
		smallLetters.start();
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		smallLetters.run();
	}

}
