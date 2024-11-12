package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssSelectors {
	
	//Syntax : reference > targetElement
	
	//Syntax : reference > tagName:nth-child(n) > tagName:nth-child(n) > tagName:nth-child(n) > .... > target
	
	
	// ancestor: ul[class='leftmenu']
	// parent : li
	// target : a[href='services.htm']
	
	// ul[class='leftmenu'] > li > a[href='services.htm']
	
	// ul[class='leftmenu'] > li:nth-child(3) > a[href='services.htm']

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)   
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5.Locate services using cssSelector locator 
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));
		


	}

}
