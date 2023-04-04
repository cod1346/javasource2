package collection;

import java.util.Arrays;
import java.util.Comparator;

public class arraysEx2 {

	public static void main(String[] args) {
		
		Integer arr[] = {51,489,156,15,478,1,3,98,8,78};
		
		String strArr[] = {"cat","dog","tiger","lion"};
		String strArr2[] = {"cat","dog","tiger","lion"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(strArr);
		
		System.out.println(Arrays.toString(strArr));
	
		String a = "1323";
		String b = "1325";
		
		
		Arrays.sort(strArr, new DescComp());
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.naturalOrder());
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		int abc = Integer.parseInt("88");
		System.out.println(abc);
	}
	
}

class DescComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2)*-1;
	}
	
	
	
}