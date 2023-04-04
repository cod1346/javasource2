package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	ArrayList<User> users = new ArrayList<>();
	//product 정보 저장 배열
	ArrayList<Product> products = new ArrayList<>();
	ArrayList<Product> cart = new ArrayList<>();
	
	
	
	
	private int sell;
	
	Scanner sc = new Scanner(System.in);
	

	@Override
	public void setTitle(String title) {		
		this.title = title;
	}

	@Override
	public void genUser() {		
		//User 2명 생성 후 배열에 저장
		users.add(new User("홍길동", PayType.CARD));
		users.add(new User("성춘향", PayType.CASH));
	}

	@Override
	public void genProduct() {		
		//Product 4개(CellPhone 2개, SmartTv 2개) 생성 후 배열에 저장
		products.add(new CellPhone("갤럭시 노트 10",500000,"SKT"));
		products.add(new CellPhone("애플 아이폰 13",900000,"U+"));
		products.add(new SmartTv("삼성 3D Smart", 1500000, "4K"));
		products.add(new SmartTv("LG Smart Tv", 1200000, "Full HD"));
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("===========================================");
		
		int i = 0;
		for (User user : users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
		}
		
		
		System.out.println("[x] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		sell = Integer.parseInt(sel);
		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "x": case "X":
			System.exit(0);  //프로그램 종료
			break;
		case "0": case "1":
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}		
	}
	
	
	public void productList() {
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]",i);
			product.printDetail();
			product.printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 :");
		String sel = sc.nextLine();
		
		switch (sel) {
		case "0":case "1":case "2":case "3":
			
			
					cart.add(products.get(Integer.parseInt(sel)));
				
			productList();
			break;
		case "h":case "H":
			start();
			break;
		case "c":case "C":
			checkOut();
			break;
		default:
			System.out.println("입력을 확인해 주세요");
		}
	}
	
	int sum = 0;
	// cart == null 브레이크
	// cart i 
	public void checkOut() {
		for (Product carts : cart) {
			if(carts==null) break;
			System.out.println("상품명 : "+carts.getName()+" 가격 : "+carts.getPrice());
			sum += carts.getPrice();
		}
		System.out.println("가격 합계 : "+sum);
		System.out.println("결제 방법 : "+users.get(sell).getPayType());
	}
	
	
	
	
	
	
	
	
}








