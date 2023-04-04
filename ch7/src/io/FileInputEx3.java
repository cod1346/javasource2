package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx3 {

	public static void main(String[] args) {
		// FileInputEx1.java를 읽어서 화면 출력
		// 행 번화와 같이 출력
		
		
		try (FileReader reader = new FileReader("C:\\Users\\cod13\\OneDrive\\바탕 화면\\sourse\\source\\javasource\\ch7\\src\\io\\FileInputEx3.java");
			FileWriter writer = new FileWriter("C:\\Users\\cod13\\OneDrive\\바탕 화면\\sourse\\source\\javasource\\ch7\\src\\io\\InputStreamEx5.java"))
				{
			
			int data = 0;
			int row = 1;
			
			System.out.print(row+"   ");
			
			while((data = reader.read())!=-1) {
				System.out.print((char)data);
				
				if (data==10) {
					row++;
					System.out.print(row+"   ");
				}
			}
			writer.write(data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
