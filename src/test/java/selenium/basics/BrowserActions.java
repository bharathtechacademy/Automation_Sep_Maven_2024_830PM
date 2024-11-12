package selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class BrowserActions {

	public static void main(String[] args) {
		
//		browser settings
		ChromeOptions options =new ChromeOptions();
//		options.addArguments("--incognito");
		options.addArguments("--disable-notifications");
		options.addArguments("--ignore-certificate-error");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--lang=en-US");

//		1. Launch the Browser window (Browser = Chrome)   
		WebDriver driver = new ChromeDriver(options);
		
//		2. Minimize browser window        
		driver.manage().window().minimize();
		
//		3. Maximize to specific resolution(800X400)    
		driver.manage().window().setSize(new Dimension(800,400));
		
//		4. Maximize the browser window   
		driver.manage().window().maximize();
		
//		5. Delete all browser cookies    
		driver.manage().deleteAllCookies();
		
//		6. Enter URL and Launch the Application (https://www.google.co.in/)   
		driver.get("https://www.google.co.in/");
		
//		7. Verify the application title (Google)  
		String actualTitle = driver.getTitle();
		String expTitle ="Google";		
		Assert.assertEquals(actualTitle, expTitle);
		
//		8. Navigate to Different application (https://www.selenium.dev/)
		driver.navigate().to("https://www.selenium.dev/");
		
//		9. Go back to previous application
		driver.navigate().back();
		
//		10. Move forward to next application 
		driver.navigate().forward();
		
//		11. Refresh the application 
		driver.navigate().refresh();
		
//		12.collect the main window id   
		String mainWindowId = driver.getWindowHandle();
		System.out.println(mainWindowId);
		
//		13.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)  
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		
//		14. Switch back to the main window
		driver.switchTo().window(mainWindowId);
		
//		15.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)  
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		16.Switch back to main window  
		driver.switchTo().window(mainWindowId);
		
//		17.Print browser window URL  
		String currentWindowUrl=driver.getCurrentUrl();
		System.out.println(currentWindowUrl);
		
//		18. Get the Size of window     
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		System.out.println(width+"x"+height);
		
//		19. Close Current Window   
		driver.close();
		
//		20. Close all remaining windows
		driver.quit();
		

	}

}
