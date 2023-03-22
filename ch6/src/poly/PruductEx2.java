package poly;

public class PruductEx2 {

	public static void main(String[] args) {
		Buyer2 buyer2 = new Buyer2();
		
		buyer2.buy(new Tv1());
		buyer2.buy(new Computer());
		buyer2.buy(new Audio());

		
		buyer2.summary();
		
	}

}
