package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//XPath ==> XML path
	
	//Absolute Xpath ==> Starts with / ==> It starts from html tag and ends with target element
	
	//Relative Xpath ==> Starts with //
	
	/** LEVEL 1 - Basic Xpath Syntaxes */
	
	//Syntax 1 : //tagName[@attribute = 'attribute-value']
	//Syntax 2 : //tagName[text() = 'text-value']
	
	/******************Level 2 - Partial Value******************/

	//p[contains(text(),'difference')]
	//Syntax 3: //tagName[contains(@Attribute,'PartialAttributeValue')]
	//Syntax 4: //tagName[contains(text(),'PartialTextValue')]
	
	//Syntax 5: //tagName[starts-with(@Attribute,'PartialAttributeValue')]
	//Syntax 6: //tagName[starts-with(text(),'PartialTextValue')]
	
	/******************Level 3 - using and operator join multiple attributes and text values ******************/
	//Syntax 7: //tagName[@Attribute1='AttributeValue' and @Attribute2='AttributeValue' and text()='TextValue']
	
	/******************Level 4 - advanced xpath with relationships ******************/
	//Syntax 8: referenceElementXpath/relationship::targetElementXpath
	
	//1. following-sibling
	//2. preceding-sibling
	//3. child
	//4. parent
	//5. ancestor
	//6. following
	//7. preceding
	// // (with in the family)

	public static void main(String[] args) {
		
//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.lenskart.com/)   
		driver.get("https://www.lenskart.com/");
		
//		5.Locate Logo using Syntax 1
		driver.findElement(By.xpath("//img[@title='Lenskart']"));
		
//		6.Locate Do more, Be more link using Syntax 2
		driver.findElement(By.xpath("//a[text()='Do More, Be More']"));
		
//		8.Locate Logo using Syntax 3
		driver.findElement(By.xpath("//img[contains(@src,'main_logo')]"));
		
//		9.Locate Do more, Be more link using Syntax 4
		driver.findElement(By.xpath("//a[contains(text(),'Be More')]"));
		
//		10.Locate partners with us link using Syntax 3
		driver.findElement(By.xpath("//a[contains(@href,'partners')]"));
		
//		11.Locate Do more, Be more link using Syntax 6
		driver.findElement(By.xpath("//a[starts-with(text(),'Do More')]"));
		
//		12.Locate textbox element using Syntax 7
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for?' and  contains(@class,'SearchInput')]"));
		
		
		
		

	}

}
