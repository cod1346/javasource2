package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("김자바", 90);
		map.put("홍자바", 95);
		map.put("박자바", 100);
		map.put("이자바", 87);
		map.put("최자바", 88);
		map.put("표자바", 89);
		
		
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		
		Set<String> key = map.keySet();
		
		Collection<Integer> v = map.values();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		System.out.println(map);
		System.out.println();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
			System.out.println("이름 : "+entry.getKey()+" , 점수 : "+entry.getValue());
			
		}
		System.out.println();
		System.out.println(map);
		System.out.println("set"+set);
		System.out.println("k"+key);
		System.out.println("v"
		+v);
		
		
		Iterator<Integer> it2 = v.iterator();
		int total = 0;
		//총점 평균 최고점 최저점
		while (it2.hasNext()) {
			total+= (Integer) it2.next();
			
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+total/set.size());
		System.out.println("최고점수 : "+Collections.max(v));
		System.out.println("최하점수 : "+Collections.min(v));
		
		
	}

}
