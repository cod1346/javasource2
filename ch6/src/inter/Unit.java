package inter;

public abstract class Unit {
	
	int x,y;
	abstract void move(int x, int y);
	void stop(){
		System.out.println("정지한다");
	}
	
}
