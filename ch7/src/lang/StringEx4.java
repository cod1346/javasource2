package lang;

public class StringEx4 {

	public static void main(String[] args) {
		String names[]= {"Queen","Tod","Kim","Park","Kim","Hong"};
		
		System.out.println(findkim(names));
	}
	
	
	public static String findkim(String[] seoul) {
		
		int index = 0;
		
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				index=i;
				break;
			} 
		}
		return "김씨 성은"+(index+1)+"번째에 있다";
		
		
		
	}
	
		
}
