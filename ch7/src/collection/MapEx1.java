package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("myid1", "1234");
		map.put("myid2", "12345");
		map.put("myid3", "123456");
		map.put("myid4", "1234567");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 패스워드를 입력해 주세요");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} 
			
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			
			if(!map.get(id).equals(password)) {
				System.out.println("패스워드를 확인해주세요.");
				
			}else {
				System.out.println("id와 패스워드가 일치합니다.");
			}
			break;

			
			
			
		}
		
		
		
	}

}
