package exam;

public class Add extends Calc{

	@Override
	int calculate() {
		return a+b;
	}
	
	@Override
	void setValue(int a, int b) {
		super.setValue(a, b);
	}
	
}
