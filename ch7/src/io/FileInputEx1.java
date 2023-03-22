package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		OutputStream out = System.out;
		
		try {
			 fis = new FileInputStream(".\\src\\io\\FileEx3.java");
			 
			 int data = 0;
			 byte[] b = new byte[100];
			 while((data=fis.read(b))!=-1) {
				 out.write(b);
			 }
			 
			 
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
