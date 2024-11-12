package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
	// Syntax 1 : tagName#id
	// Syntax 2 : tagName.className
	// Syntax 3 : tagName[attribute='attribute-value']
	// Syntax 4 : tagName[attribute *='partial-attribute-value']
	
	//Advanced Css Selector
	
	// ancestor > parent > targetElement

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
//		5.Locate search box using cssSelector locator - Syntax 1
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		6.Locate search box using cssSelector locator - Syntax 2
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		7.Locate search box using cssSelector locator - Syntax 3
		driver.findElement(By.cssSelector("textarea[title='Search']"));
		
//		8.Locate how search works link using cssSelector locator - Syntax 4
		driver.findElement(By.cssSelector("a[href*='howsearchworks']"));
	

	}

}
