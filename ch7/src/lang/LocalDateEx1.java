package lang;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		
//		System.out.println(today);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println();
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println();
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
	}

}
