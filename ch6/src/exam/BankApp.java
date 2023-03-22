package exam;

import java.util.Scanner;

public class BankApp {

	private static Account[] accountArray = new Account[10];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
				System.out.println("========================================================");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("========================================================");
				System.out.print("선택 : ");
				
				// nextLine(); : String 타입으로 입력값을 처리
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				switch (selectNo) {
				case 1:
					createAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					//while문 종료ㅑ
					run = false;
					break;

				default:
					break;
				}
		}//while문 종료
		
	}//main 종료
	
	private static void createAccount() {
		System.out.print("계좌번호 : ");
		String no = scanner.nextLine();
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("잔액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]==null) {
				accountArray[i]=new Account(no, name, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			} 
		}
	}
	
	private static void accountList() {
		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j]!=null) {
				System.out.printf("계좌번호 : %s\t예금주 : %s\t잔액 : %d\n",accountArray[j].getNo(),accountArray[j].getOwner(),accountArray[j].getBalance());
			}else break;	
		}
	}
	
	private static void deposit() {
		System.out.print("계좌번호 : ");
		String num = scanner.nextLine();
		System.out.print("입금액 : ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j].getNo().equals(num)) {
				
				accountArray[j].setBalance(amount+accountArray[j].getBalance());
				
				System.out.println("현재잔액 : "+accountArray[j].getBalance());
				
				break;
			}	else System.out.println("계좌번호 오류"); break;
		}
	}
	
	private static void withdraw() {
		System.out.print("계좌번호 : ");
		String num = scanner.nextLine();
		System.out.print("출금액 : ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		for (int j = 0; j < accountArray.length; j++) {
			if (accountArray[j]!=null&&num==accountArray[j].getNo()) {
				
				accountArray[j].setBalance(amount-accountArray[j].getBalance());
				
				System.out.println("현재잔액 : "+accountArray[j].getBalance());
			}	//else System.out.println("계좌번호 오류"); break;
		}
		
	}
	
	
}
