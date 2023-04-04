package lang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectEx1 {

	public static void main(String[] args) {
		
		Object obj;
		
		char c[]= {'H','e','L','L','L','L','L','L'};	
		String str1 = new String(c);
		
		System.out.println(str1);
		
		
		System.out.println(str1.charAt(1));
		
		String atat = "김찬김찬김찬";
		
		System.out.println(atat.charAt(3));
		
		System.out.println(atat.length());
		
		String str3 = "자바 프프으로그래프";
		
		System.out.println(str3.length());
		//변수선언
		//변수가 0이면 들어있지않음
		//이프문 한번 돌때마다 +1
		
		//첫번쨰 돌리면 자 !=프
		//at을 돌림 
		//프가 들어있으면 트루 
		int num = 0;
		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i)=='프') {
			System.out.println("들어있음"); 
			num ++;
			break; 
			}
		}
		System.out.println(num+"개 들어있음");
		if(num==0)System.out.println("들어있지않음");
		
		int num1 = 0;
		for (int i = 0; i < atat.length(); i++) {
			if(atat.charAt(i)=='호') {
			num1++;}
		}
		System.out.println();
		System.out.println(num1+"개 들어있음");
		System.out.println(num1>0 ? "들어있음" : "들어있지않음");
		
		//char c[]= {'H','e','L'};
		
		System.out.println();
		System.out.println(str3.indexOf('그',5));
		System.out.println(str3.indexOf('자')>-1 ? "들어있음" : "들어있지않음");
		
		
		String ssn = "99213213-2132131";
		
		String result = ssn.substring(3);
		String result1 = ssn.substring(3, 5);
		
		System.out.println(result);
		System.out.println(result1);
				
		System.out.println(ssn.concat("그"));
		
		
		String str4 = "java.lang.Object";
		
		System.out.println(str4.startsWith("a"));
		System.out.println(str4.startsWith("ja"));
		
		System.out.println(str4.startsWith("v",2 ));
		System.out.println(str4.startsWith(".",4 ));
		
		
		System.out.println();
		System.out.println(str4.contains("jaa"));
		System.out.println(str4.contains("va."));
		
		System.out.println();
		
		System.out.println(str4.replace("jav", "자바"));
		System.out.println(str4.replace("j", "J"));
		System.out.println();
		System.out.println(str4.replace("fdsfsd", "자바"));
		System.out.println();
		
		System.out.println(str4);
		str4=str4.replace("jav", "자바");
		System.out.println(str4);
		
		System.out.println();
		System.out.println(str4);
		System.out.println(str4.replaceFirst(".", "결과"));
		System.out.println(str4.replaceAll(".", "결과"));
		System.out.println(str4.replaceFirst(result1, "이게뭐야"));
		
		int num3 =3;
		System.out.println();
		String arrf = "arr,d,,,,,d,,,,d,,,";
		String[] arr=arrf.split(",");
		
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int aa = 123;
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		arr= arrf.split(",", 3);

		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("aaa".compareTo("A"));
		
		
		int a = "aaa".compareTo("cffdsfds");
		
		System.out.println(a);
		
		//String str3 = "자바 프프으로그래프";
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(str3.indexOf("그래",3));
		System.out.println(str3.indexOf('자')>-1 ? "들어있음" : "들어있지않음");
		
		
		
		
	}
	
	

}
