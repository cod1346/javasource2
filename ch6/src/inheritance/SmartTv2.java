package inheritance;

public class SmartTv2 extends Tv2 {
	boolean caption;
	
//	public SmartTv2() {
//		super();
//	}
	

	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
		
}
