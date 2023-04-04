package lang;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.toString());
		
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println((today.get(Calendar.MONTH))+1+"월"); //(0~11)
		System.out.println(today.get(Calendar.YEAR)+"년의 "+today.get(Calendar.WEEK_OF_YEAR)+"번째주");
		System.out.println((today.get(Calendar.MONTH)+1)+"월의 "+today.get(Calendar.WEEK_OF_MONTH)+"번째 주");
		System.out.println(today.get(Calendar.DATE)+"일");
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇번쨰 일"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println(today.get(Calendar.DAY_OF_WEEK)+"요일");
		System.out.println(today.get(Calendar.AM_PM)+":0오전,1오후");
		System.out.println(today.get(Calendar.HOUR)+" : 0~11");
		System.out.println(today.get(Calendar.HOUR_OF_DAY)+" : 0~11");
		
		System.out.println(today.get(Calendar.MILLISECOND));
	}

}
