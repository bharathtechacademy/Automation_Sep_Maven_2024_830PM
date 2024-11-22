package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumWaits {
	
	//Implicit Wait ==> maximum it will wait for the specified amount time and it will stop no such element exception
	
	//Explicit Wait ==> Exclusively wait for specific condition for max amount of time specified
	
	//Fluent Wait ==> Exclusively wait for specific condition for max amount of time specified along with specific interval to check the condition

	public static void main(String[] args) {
		
//      1. Launch browser window(Chrome)
		WebDriver driver = new ChromeDriver();
		
//      2. Maximize the browser window 
		driver.manage().window().maximize();
		
//      3. Delete all the cookies  
		driver.manage().deleteAllCookies();
		
//      4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//      5. Verify application title (ParaBank | Welcome | Online Banking)
		String expTitle ="ParaBank | Welcome | Online Banking";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expTitle);
		
//      6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
		//Implicit Wait ==> maximum it will wait for the specified amount time and it will stop no such element exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit Wait ==> Exclusively wait for specific condition for max amount of time specified
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		//Fluent Wait ==> Exclusively wait for specific condition for max amount of time specified along with specific interval to check the condition
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
		fluentWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));


	}

}
