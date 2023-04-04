package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		//입력받은 값으로 Car3 인스턴스 생성
		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("제조사 : ");
//		String company = sc.nextLine();
//
//		System.out.print("모델 : ");
//		String model = sc.nextLine();
//		
//		System.out.print("색상 : ");
//		String color = sc.nextLine();
//		
//		System.out.print("최대속도 : ");
//		int maxspeed = Integer.parseInt(sc.nextLine());
//		
//		Car3 car = new Car3(company,model,color, maxspeed);
//
//		System.out.println(car);
//		
		
		Car3[] car2 = new Car3[3];
		
		for (int i = 0; i < car2.length; i++) {
			System.out.print("제조사 : ");
			String company = sc.nextLine();
			
			System.out.print("모델 : ");
			String model = sc.nextLine();
			
			System.out.print("색상 : ");
			String color = sc.nextLine();
			
			System.out.print("최대속도 : ");
			int maxspeed = Integer.parseInt(sc.nextLine());
			
			car2[i] = new Car3(company, model, color, maxspeed);
			System.out.println("-------------------------");
		}
		
		for (int i = 0; i < car2.length; i++) {
			System.out.println(car2[i]);
		}
		

	}

}
