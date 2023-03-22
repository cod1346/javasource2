package lang;

public class StringEx3 {

	public static void main(String[] args) {

		System.out.println(count("1ABABAB2354AB12AB345AB","AB"));

		System.out.println(count("12345","AB"));
		

	}

//	(count("12354AB12AB345AB","AB")  
	
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos =0;  //// 찾기 시작할 위치
		
		for (int i = 0; i < src.length(); i++) {
			
			if ((pos=src.indexOf(target,pos))!=-1) {
				
				count++;
				pos+=target.length();
			} else break;
		}
//		System.out.println(str3.indexOf("그",3));
		return count;
		
	}
}
