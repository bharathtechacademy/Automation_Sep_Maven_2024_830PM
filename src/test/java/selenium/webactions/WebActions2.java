package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {

	static WebDriver driver = null;

	public static void main(String[] args) {

//      1. Launch browser window(Chrome)
		driver = new ChromeDriver();

//      2. Maximize the browser window
		driver.manage().window().maximize();

//      3. Delete all the cookies
		driver.manage().deleteAllCookies();

//      4. Enter URL and Launch the application (https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");

//      5. Wait for Page-load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//      6. Enter First name and Last name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		firstName.clear();
		firstName.sendKeys("Ravi");
		lastName.clear();
		lastName.sendKeys("Jadav");

//      7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("RaviJadav@test.com");

//      8. Select Gender (Female)
		selectGender("Female");

//      9. Enter mobile number
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("9553220022");
		
//      10.Select DOB (1-Feb-1991)
		selectDOB("1", "February", "1991");

//      11.Search and Select Computer Science
		selectSubject("Computer Science");

//      12.Select Hobbies as Sports and Reading
		String [] hobbies = {"Sports","Reading"};
		selectHobbies(hobbies);

//      13.Upload photo
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadBtn.sendKeys(System.getProperty("user.dir")+"\\Files\\NOV 25 - 1.png");

//      14. Wait till window open to upload the file

//      15. Upload file

//      16. Wait till file upload

//      17.Submit Details
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", submitButton);
		
//      18. Close browser window	
		driver.quit();

	}
	
	public static void selectSubject(String subject) {
		WebElement subjectBox = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value')]"));	
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", subjectBox);
		
		Actions action = new Actions(driver);
		action.sendKeys(subjectBox,subject).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"), 0));	
		
		WebElement option = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
		option.click();
		
	}
	
	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyElement = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", hobbyElement);
			if (!hobbyElement.isSelected()) {
				hobbyElement.click();
			}
		}
	}

	public static void selectGender(String option) {
		WebElement gender = driver.findElement(By.xpath("//label[text()='"+option+"']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", gender);
		gender.click();
	}

	public static void selectDOB(String date, String month, String year) {
		// open calendar
		WebElement dobTxtb = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dobTxtb.click();

		// wait for the calendar
		By monthElemnt = By.xpath("//select[contains(@class,'month')]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(monthElemnt, 0));

		// Select month
		WebElement monthDrp = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		Select selectMonth = new Select(monthDrp);
		selectMonth.selectByVisibleText(month);

		// Select year
		WebElement yearDrp = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select selectYear = new Select(yearDrp);
		selectYear.selectByVisibleText(year);
		
		//Select the date
		WebElement dateLbl = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+date+"']"));
		dateLbl.click();
	}

}
