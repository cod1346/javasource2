package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; 6> set.size(); i++) {
			int num = (int)(Math.random()*45)+1;
			
			set.add(num);
		}
		System.out.println(set);
		
		TreeSet<Integer> set2 = new TreeSet<>();
		
		int score[] = {80,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			set2.add(score[i]);
		}
		
		System.out.println("95보다 작은 값 : "+set2.headSet(95));
		System.out.println("95보다 큰 값 : "+set2.tailSet(95));
	}

}
