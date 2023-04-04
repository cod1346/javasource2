package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx1 {

	public static void main(String[] args) {
		
		int arr[] = {10,3,523,454,6};
		
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int arr2[][] = {{11,22},{21,22}};
		
		System.out.println(Arrays.deepToString(arr2));
		
		
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"AAA","BBB"};
		System.out.println(Arrays.equals(str1, str2));
		
		String[][] str1D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println(Arrays.deepEquals(str1D, str2D));
		
		System.out.println();
		
		int arr3[]=new int[5];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		int arr4[] = arr3;
		
		System.out.println(Arrays.toString(arr4));
		System.out.println();
		
		int arr5[] = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr5));
		
		int arr6[] = Arrays.copyOfRange(arr5, 2, 4);
		System.out.println(Arrays.toString(arr6));
		
		int arr7[] = new int [5];
		
		Arrays.fill(arr7, 7);
		
		System.out.println(Arrays.toString(arr7));
		
		
		Integer arr8[] = {3,8,1,5,4,8,7,2};
		
		String str[] = {"ddd","dfds","11fqwq"};
		
		Arrays.sort(arr8);
		Arrays.sort(str);
		
		System.out.println(Arrays.toString(arr8));
		System.out.println(Arrays.toString(str));
		
		System.out.println(Arrays.binarySearch(arr8, 1));
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr8));
		
		System.out.println(list);
		
		list.add(9);
		System.out.println(list);
		
		
	}

}
