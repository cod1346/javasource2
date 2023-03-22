package generics;

class Fruit{
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}
class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
}
class FruitBox<T extends Fruit> extends Box3<T>{}
public class GenericsEx4 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox();
		FruitBox<Apple> appleBox = new FruitBox();
		FruitBox<Grape> grapeBox = new FruitBox();
//		FruitBox<Toy> grapeBox = new FruitBox();
		
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
		System.out.println(fruitBox.size());
		System.out.println(appleBox.size());
		System.out.println(grapeBox.size());
		
		System.out.println(fruitBox.get(0));
		
		
	}

}
