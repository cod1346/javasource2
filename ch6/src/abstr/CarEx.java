package abstr;

public class CarEx {

	public static void main(String[] args) {
		Car car = new AiCar();
		car.run();
		
		System.out.println("=====================================");
		
		car = new ManuCar();
		car.run();
		
		
	}

}
