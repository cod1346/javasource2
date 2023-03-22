package inter;
/* 인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음 => 일반매소드, 멤버변수
 * 
 */
public interface Account {
	
	int x=0;
	
	void stop();
	
	static void print() {}
	default void add() {}
	
}
