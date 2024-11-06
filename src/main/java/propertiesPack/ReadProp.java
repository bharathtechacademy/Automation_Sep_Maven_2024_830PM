package propertiesPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) {
		Properties prop = ReadProp.readData("dev");
		System.out.println("Launch the Application using url : "+prop.getProperty("url"));
		System.out.println("Enter username as :"+prop.getProperty("username"));
		System.out.println("Enter password as :"+prop.getProperty("password"));
	}
	
	
	public static Properties readData(String env) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+env+"\\Config.properties");
			prop.load(fis);			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return prop;		
	}

}
