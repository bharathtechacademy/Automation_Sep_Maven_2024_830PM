package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions3 {

	public static void main(String[] args) {

//      1.Launch Chrome Browser
		WebDriver driver = new ChromeDriver();

//      2.Maximize the browser window
		driver.manage().window().maximize();

//      3.Launch the application (https://demoqa.com/alerts)
		driver.get("https://demoqa.com/alerts");

//      4.Locate Alert buttons
		WebElement infoAlertBtn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmationAlertBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptAlertBtn = driver.findElement(By.xpath("//button[@id='promtButton']"));

//      5.Launch Information alert
		infoAlertBtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();

//      6.Print Alert message
		System.out.println(alert.getText());

//      7.Click on OK button
		alert.accept();

//      8.Launch confirmation alert
		confirmationAlertBtn.click();

		wait.until(ExpectedConditions.alertIsPresent());

		Alert confirmationAlert = driver.switchTo().alert();

//      9.Print Alert message
		System.out.println(confirmationAlert.getText());

//      10.Click on Cancel button
		confirmationAlert.dismiss();

//      11.Launch prompt alert with dialog box alert
		promptAlertBtn.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert promptAlert = driver.switchTo().alert();

//      12.Print message
		System.out.println(promptAlert.getText());

//      13.Enter Text in Alert
		promptAlert.sendKeys("Selenium");

//      14.Click on OK button
		promptAlert.accept();

	}

}
