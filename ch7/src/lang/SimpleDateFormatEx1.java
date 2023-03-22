package lang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		//시스템 날짜와 시간 가져오기
		Date date = new Date();
		//날짜와 시간을 특정 형식에 맞춰 출력 가능하게 하는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		System.out.println(date);
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("y년M월d일 E요일 ah시mm분");
		
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		
			Date d;
			try {
				d = sdf3.parse("2023년 03월 09일");
				System.out.println(sdf4.format(d));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

}
