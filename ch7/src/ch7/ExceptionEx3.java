package ch7;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			
			System.out.println(args[0]);
			System.out.println(3/0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행방법 확인");
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");

		}
		catch (Exception e) {
			System.out.println("오류 발생");
		}
	}

}
