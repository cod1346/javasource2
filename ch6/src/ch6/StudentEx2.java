package ch6;

import java.util.Iterator;

public class StudentEx2 {
	public static void main(String[] args) {
		//Student2 객체 배열
		
		Student2 stuArr[]=new Student2[5];
		
		System.out.println(stuArr[0]);
		
		//초기화
		stuArr[0]=new Student2("홍길동", 1, 1, 45, 55, 65);
		stuArr[1]=new Student2("조민성", 1, 1, 45, 55, 65);
		stuArr[2]=new Student2("성춘향",1, 1, 45, 55, 65);
		stuArr[3]=new Student2("서유기", 1, 1, 45, 55, 65);
		stuArr[4]=new Student2("이승기", 1, 1, 45, 55, 65);

		
		
		System.out.println("이름 : "+stuArr[0].name);
		System.out.println("반 : "+stuArr[0].ban);
		System.out.println("번호 : "+stuArr[0].no);
		System.out.println("국어 : "+stuArr[0].kor);
		System.out.println("영어 : "+stuArr[0].eng);
		System.out.println("수학 : "+stuArr[0].math);
		
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("이름 : "+stuArr[0].name);
			System.out.println("반 : "+stuArr[0].ban);
			System.out.println("번호 : "+stuArr[0].no);
			System.out.println("국어 : "+stuArr[0].kor);
			System.out.println("영어 : "+stuArr[0].eng);
			System.out.println("수학 : "+stuArr[0].math);
			System.out.println("총점 : "+stuArr[i].getTotal());
			System.out.println("평균 : "+stuArr[i].getAverage());
		}
		
	}
}











