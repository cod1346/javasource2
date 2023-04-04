package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {

		OutputStream out = System.out;
		
		InputStream in = System.in;
		
		try {
			int input = 0;
			
			while((input = in.read())!=-1) {
				out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
