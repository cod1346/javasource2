package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx5 {

	public static void main(String[] args) {
		
		
		try (FileReader fr = new FileReader("c:\\temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\temp\\output3.txt");
				BufferedWriter bw = new BufferedWriter(fw)){
			String data = null;
			while( (data=br.readLine()) !=null) {
				bw.write(data);
				bw.newLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
