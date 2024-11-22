package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathLocators {
	
	//sibling --> parent --> ancestor --> ancestor's parent
	
	
	//ancestor: //ul[@class='leftmenu']
	//parent : //li
	//target xpath : //a[text()='Services']
	
	
	//ul[@class='leftmenu']/child::li/child::a[text()='Services']	
	//ul[@class='leftmenu']//a[text()='Services']	
	//li[text()='Solutions']/following-sibling::li/child::a[text()='Services']

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)   
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5.Locate services using xpath locator 
		driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));

	}

}
