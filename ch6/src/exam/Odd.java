package exam;

public class Odd extends OddDetector {

	
	public Odd(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isOdd() {
		if(getN()%2==1) {
			return true;
		}		
		return false;
	}

}
