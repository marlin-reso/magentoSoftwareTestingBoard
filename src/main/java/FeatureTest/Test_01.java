package FeatureTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_01 {
	Properties prop;
	public static void main(String[] args) throws IOException {
		
		Test_01 tc = new Test_01();
		Properties prop = tc.initProperties();
		System.out.println(prop.getProperty("url"));
		
			
			
			
			
			
		}
	
	public  Properties initProperties() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Config\\config.dev.properties");
		prop.load(fis);
		
		return prop;
		
		
		
	}

}
