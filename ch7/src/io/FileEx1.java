package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp","test1.txt");
		
		File dir = new File("c:\\temp");
		File file3 = new File(dir,"test1.txt");

		
		String fileName = file1.getName();
		
		int pos = fileName.indexOf(".");
		
		System.out.println(fileName.substring(0, pos));
		
		System.out.println(file1.getPath());
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getCanonicalPath());
		
		System.out.println("겟페런츠="+file1.getParent());
		
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
	}

}
