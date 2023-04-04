package poly;

public class CarEx {

	public static void main(String[] args) {
		//Car car = new FireEngine();
		
		//Car car2 = new Ambulance();
		
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car= fireEngine;
		
		fireEngine2 = (FireEngine)car;
		
		
		
		
	}

}
