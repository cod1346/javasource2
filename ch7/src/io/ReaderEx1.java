package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try (FileReader fr = new FileReader("C:\\Users\\cod13\\OneDrive\\바탕 화면\\sourse\\source\\javasource\\ch7\\src\\io\\FileInputEx1.java");
				BufferedReader br= new BufferedReader(fr)){
			
			
//			writer = new FileWriter("C:\\Temp\\12345.txt");
			
			String data = null;
			int i = 1;
			while((data=br.readLine())!=null) {
				System.out.println(i+" "+data);
				i++;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
