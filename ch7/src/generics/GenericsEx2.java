package generics;

import java.util.ArrayList;
import java.util.List;

/////////////////////////////////////////////////////////////////////////////////////
							class Product{}
class Tv extends Product{}					class Audio extends Product{}
/////////////////////////////////////////////////////////////////////////////////////

public class GenericsEx2 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<>();
		
		ArrayList<Tv> tvList = new ArrayList<>();
		
		ArrayList<Product> tvList2 = new ArrayList<>();
		
		List<Tv> tvList3 = new ArrayList<>();
		
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());

		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
	}
	
	static void printAll(ArrayList<Product> list ) {
		for (Product product : list) {
			System.out.println(product);
		}
	}
}
