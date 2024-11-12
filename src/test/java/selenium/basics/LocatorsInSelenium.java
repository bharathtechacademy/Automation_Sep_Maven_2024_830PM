package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
	
	
	//WebElement ==> the element displayed with in the UI ==> WebElement
	//Locator ==> the selenium method used to locate the webelement location ==> By
	
	//Locator Methods ==> will locate the web element based on html design of web application
	
//	1. id ==> id attribute value
//	2. name  ==> name attribute value
//	3. className ==> class attribute value
//	4. tagName ==> html tag value
	
//	5. linkText ==> text value of hypelink
//	6. partialLinkText ==> partialtext value of hypelink
	
//	7. cssSelector
//	8. xpath
	
//	9. Relative Locators
	

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
//		5.Locate search box using id locator 
		driver.findElement(By.id("APjFqb"));

//		6.Locate search box using name locator 
		driver.findElement(By.name("q"));
		
//		7.Locate search box using className locator 
		driver.findElement(By.className("gLFyf"));
		
//		8.Locate search box using tagName locator 
		driver.findElement(By.tagName("textarea"));
		
//		9.Locate how search works link using linkText locator 
		driver.findElement(By.linkText(" How Search works "));
		
//		10.Locate how search works link using partialLinkText locator 
		driver.findElement(By.partialLinkText("Search work"));

	}

}
