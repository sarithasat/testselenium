package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\makka\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumSessions\\ReadPropertyFile.java");
		prop.load(ip);
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		
		
	}
}