package ch6;

import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		//Student2 인스턴스 생성
		//사용자로부터 입력을 받은 정보를 가지고 생성
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("반 : ");
//		int ban = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("번호 : ");
//		int no = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("국어 : ");
//		int kor = Integer.parseInt(sc.nextLine());
//
//		System.out.print("영어 : ");
//		int eng = Integer.parseInt(sc.nextLine());
//		
//		System.out.print("수학 : ");
//		int math = Integer.parseInt(sc.nextLine());
//
//		Student2 student = new Student2(name, ban, no, kor, eng, math);
//		
//		
//		System.out.println(student);
		
		Scanner sc = new Scanner(System.in);
		
		Student2 stu[] = new Student2[3];
		
		
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("반 : ");
			int ban = Integer.parseInt(sc.nextLine());
			
			System.out.print("번호 : ");
			int no =Integer.parseInt( sc.nextLine());
			
			System.out.print("국어 : ");
			int kor =Integer.parseInt( sc.nextLine());
			
			System.out.print("영어 : ");
			int eng =Integer.parseInt( sc.nextLine());
			
			System.out.print("수학 : ");
			int math =Integer.parseInt( sc.nextLine());
			
			stu[i]= new Student2(name,ban ,no,kor,eng,math);
			
		}
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
		
		//향상된 for
		
		for(Student2 ddd:stu) {
			System.out.println(ddd);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
