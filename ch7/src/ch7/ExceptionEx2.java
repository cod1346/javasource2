package ch7;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(3/1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
//			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace(); // 개발시 자주 쓰는 코드 형태임 의미는 예외가 발생하는 구문을 추적해서 출력
		} finally {
			System.out.println("반드시 실행");
		}
		
	}

}
