package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Collections.sort(list);
		
		Set<Integer> set = new HashSet<>(list);
		
		
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(1);
		System.out.println(list);
		
		System.out.println(set);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
