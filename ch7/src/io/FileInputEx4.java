package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class FileInputEx4 {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\output1721.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			for(int i ='1'; i<='9';i++) {
				bos.write(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
