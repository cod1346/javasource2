package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// 입력값으로 GoodsStock 인스턴스 생성
		
		Scanner sc = new Scanner(System.in);
		
		
//		
//		GoodsStock good = new GoodsStock(code, stockNum);
//		
//		System.out.println(good);
//		
//		
		GoodsStock good[] = new GoodsStock[3];
		
		good[0]= new GoodsStock(null, 0);
		good[1]= new GoodsStock(null, 0);
		good[2]= new GoodsStock(null, 0);
		
		for (int i = 0; i < good.length; i++) {
			System.out.print("상품명 : ");
			String code = sc.nextLine()	;
//			
			System.out.print("재고 : ");
			int stockNum = Integer.parseInt(sc.nextLine());

			good[i] = new GoodsStock(code, stockNum);
			System.out.println("---------------------------------------");
		}

		//확인용
		for (int i = 0; i < good.length; i++) {
			System.out.println(good[i]);
		}
		
		for(GoodsStock num:good) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
