package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx1 {

	public static void main(String[] args) {
		Person p1 = new Person("김유신", "엔지니어");
		Person p2 = new Person("이순신", "선생님");
		
		
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\serial.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
				oos.writeObject(p1);
				oos.writeObject(p2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		try (FileInputStream fos = new FileInputStream("c:\\temp\\serial.dat");
				BufferedInputStream bos = new BufferedInputStream(fos);
				ObjectInputStream oos = new ObjectInputStream(fos)){
			
			for (int i = 0; i < 2; i++) {
				Person p = (Person) oos.readObject();
				System.out.println(p);
			}	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
