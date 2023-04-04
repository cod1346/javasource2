package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {

		
		
		try (InputStream in = System.in;){
			byte[] b = new byte[100];
			
			System.out.print("이름 : ");
			int nameByte = in.read(b);
			
			String name = new String(b,0,nameByte-2);
			
			System.out.print("하고 싶은 말: ");
			int commentByte = in.read(b);
			
			String comment = new String(b,0,commentByte-2);
			
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
			System.out.println(commentByte);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}

}
