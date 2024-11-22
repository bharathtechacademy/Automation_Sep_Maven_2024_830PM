package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WebActions5 {
	
//	 ExtentHtmlReporter html = new ExtentHtmlReporter("Extent.html");
//	 ExtentXReporter extentx = new ExtentXReporter("localhost");
//	 
//	 ExtentReports extent = new ExtentReports();
//	 extent.attachReporter(html, extentx);
//	 
//	 extent.createTest("TestName").pass("Test Passed");
//	 
//	 extent.flush();
	
	public static ExtentHtmlReporter html = null; //white paper
	public static ExtentReports extent = null; //printer
	public static ExtentTest logger = null; //color
	
	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		
		html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\AutomationReport.html"); //creating empty report
		extent = new ExtentReports(); //initializing reports
		extent.attachReporter(html);
		
		logger =extent.createTest("Parabank Application Test");
				
//      1. Launch browser window(Chrome)
		driver = new ChromeDriver();
		logger.info("Browser Launched");
		
//      2. Maximize the browser window 
		driver.manage().window().maximize();
		
//      3. Delete all the cookies  
		driver.manage().deleteAllCookies();
		
//      4. Enter URL and Launch the application (https://parabank.parasoft.com/parabank/index.htm)
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		logger.pass("Application  Launched Successfully");
		
//      5. Verify application title (ParaBank | Welcome | Online Banking)
		String expTitle ="ParaBank | Welcome | Online Banking";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expTitle);
		logger.pass("Title is matching Successfully");
		
//      6. Verify application logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		boolean logoIsDisplayed = logo.isDisplayed();
		Assert.assertTrue(logoIsDisplayed);
//		logger.addScreenCaptureFromPath(takeElementScreenshot(logo, "logo.png"), actualTitle);
		
//      7. Verify application caption (Experience the difference)
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		String expctedCaption = "Experience the difference";
		String actualCaption =caption.getText();
		Assert.assertEquals(actualCaption, expctedCaption);
		
//      8. Enter Invalid credentials in Username and Password textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		username.clear();
		password.clear();
		
		username.sendKeys("Invalid User");
//		password.sendKeys("Invalid Pass");
		
//      9. Verify button label (LOG IN) and Click on Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		String expectedLabel = "LOG IN";
		String actualLabel = loginButton.getAttribute("value").toUpperCase();
		Assert.assertEquals(actualLabel, expectedLabel);
		
		loginButton.click();				
		
//      10. Verify error message is coming
		By errorMsg = By.xpath("//p[@class='error']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(errorMsg, 0));
		logger.error("Application  displays Login Error");
		logger.addScreenCaptureFromPath(takeWindowScreenshot(driver, "LoginError.jpeg"));
		
//      11. Click on Admin page link
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		
//      12. Wait for admin page
		By adminPageHeader = By.xpath("//h1[contains(text(),'Administration')]");
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(adminPageHeader, 0));
		
//      13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
//      14. Scroll-down till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", loanProvider);
		
//      15. Select Loan provider as 'Web Service'
		Select s = new Select(loanProvider);
		s.selectByVisibleText("Web Service");
		
//      16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//      17. wait for Successful submission message
		By successMsg = By.xpath("//b[text()='Settings saved successfully.']");
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(successMsg, 0));
		
//      18. Click on Services Link
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//      19. Wait for Services page
		By bookStroreServicesLocator = By.xpath("//span[text()='Bookstore services:']");
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(bookStroreServicesLocator, 0));
		
//      20. Scroll-down till Bookstore services
		WebElement bookStroreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView()", bookStroreServices);
		
//      21. Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr"));
		int totalActualRows = rows.size();
		int expRows = 8;
		Assert.assertEquals(totalActualRows, expRows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr[1]//td"));
		int actualColumns = columns.size();
		int expColumns= 3;
		Assert.assertEquals(actualColumns, expColumns);
		
//      22. Get Column headers of book store services table
		for(int i=0; i<columns.size(); i++) {
			System.out.println("Column "+(i+1)+" Header is : "+columns.get(i).getText());
		}
		
//      23. Get all the data from book store service table
		for(int r=1; r<=totalActualRows; r++) {
			for(int c=1; c<=actualColumns; c++) {
				System.out.println("Row "+r+" Column "+c+" Value is : "+cellValue(r,c) );
			}
		}
		
		extent.flush(); //stop printing
		
//      24. Close browser window
		driver.quit();

	}

	public static void selectDataAccessMode(String option) {
		WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+option+"']"));
		dbaMode.click();
	}
	
	public static String cellValue (int row , int col) {
		WebElement cell = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tr["+row+"]//td["+col+"]"));
		return cell.getText();
	}
	
	public static String takeWindowScreenshot(WebDriver driver, String screenshotNameAndFromat) throws IOException {
		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotNameAndFromat;
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}
	
	public static String takeElementScreenshot(WebElement element, String screenshotNameAndFromat) throws IOException {
		String screenshotPath = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotNameAndFromat;
		File screenshotFile = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotPath));
		return screenshotPath;
	}
}
