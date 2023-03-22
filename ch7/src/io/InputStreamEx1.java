package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {

		InputStream in = System.in;
		
		try {
			int input = 0;
			
			while((input = in.read())!=-1) {
				System.out.println((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}

}
