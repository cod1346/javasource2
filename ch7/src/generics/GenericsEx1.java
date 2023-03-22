package generics;


public class GenericsEx1 {

	public static void main(String[] args) {

		
		//ArrayList<String> list = new ArrayList<>();
		
		Box1 box1 = new Box1();
		
		box1.setItem("dfsafs");
		String item = (String)box1.getItem();
		System.out.println(item);
		
		
		
		box1.setItem(1);
		int i = (int)box1.getItem();
		System.out.println(1);
		//////////////////////////////////////////
		System.out.println();
		///////////////////////////////////////////
		Box2<Integer> box2 = new Box2<>();
		box2.setItem(2);
		int item2;
		item2 = box2.getItem();
		System.out.println(item2);
		////////////////////////////////
		Box2<String> box3 = new Box2<>();
		box3.setItem("dkdlxpa");
		
		item = box3.getItem();
		
		System.out.println(item);
	
	
	
	
	}

}
