package lang;

public class StringBufferEx1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(100);

		StringBuffer sb1 = new StringBuffer("01234567");
		
		
		System.out.println(sb+""+sb);
				
		System.out.println(sb1);
		
		System.out.println(sb1.length());
				
		
				
		sb1.replace(1, 1, "이게뭐");
		
		System.out.println(sb1);
			
		
		StringBuffer str3 = new StringBuffer("0123456789");
		System.out.println(str3);
		
		StringBuffer aa = new StringBuffer();
		
		for (int i = str3.length()-1; i>=0; i--) {
			System.out.print(str3.charAt(i));
		}
		
		System.out.println();
		sb1= new StringBuffer(str3);
		System.out.println(sb1);
		System.out.println(str3);
		
		
		
		
	}

}
