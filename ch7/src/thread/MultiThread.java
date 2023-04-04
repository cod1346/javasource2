package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MultiThread {

	public static void main(String[] args) {
		
		BufferedReader input = null;
		String line = "";
		
		
		try {
			URL url = new URL("https::\\www.naver.com");

				
				input = new BufferedReader(new InputStreamReader(url.openStream()));
				
				while ((line = input.readLine())!=null) {
					System.out.println(line);
				}
		}
		 catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
