package selenium.basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		
//		0. Setup browser driver
//		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
//		1. Launch the Edge Browser		
		WebDriver driver = new EdgeDriver();	// new edge browser session launched	
		
//		2. Enter URL and Launch the Application
		driver.get("https://www.selenium.dev/");
		
//		3. Close the Browser
		driver.close();
		
//		driver = new ChromeDriver();

	}

}
