package ch7;

public class ExceptionEx5 {

	public static void main(String[] args) {
		int arr[]=new int[0];
		try {
			getAverage(arr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	// getAverage 메소드에 예외 선언
	// getAverage 메소드를 호출하면 예외가 발생할 수 있음
	static double getAverage(int arr[]){
		if(arr.length==0) {
			//throw new Exception("비어있는 배열입니다.");
			throw new RuntimeException("비어있는 배열입니다.");
		}
		return getTotal(arr)/arr.length;
	}

	
	static int getTotal(int arr[]) {
			int total = 0;
			for (int i = 0; i < arr.length; i++) {
				total +=arr[i];
			}
			return total;
		}
	
}
