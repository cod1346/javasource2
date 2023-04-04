package abstr;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	
	// final : 오버라이딩(기능변경) 금지
	final public void run() {
		startCar();
		drive();
		stop();
		stopCar();
	}
	
	
	
	
	
}
