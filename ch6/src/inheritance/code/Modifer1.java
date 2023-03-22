package inheritance.code;

import modifier.Account;

public class Modifer1 {
	
	Account acc=new Account();
	
	int age;
	
	void print() {
		String ano = acc.getAno();
		System.out.println("ano : "+ano);

		acc.setAno("111-222");
		System.out.println("ano : "+acc.getAno());
		System.out.println(ano);
		System.out.println("ano : "+acc.getAno());
	}

	
	public static void main(String[] args) {
		Modifer1 modifer1 = new Modifer1();
		modifer1.print();
	}
}
