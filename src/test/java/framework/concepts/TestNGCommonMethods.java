package framework.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class TestNGCommonMethods {
	
	@BeforeSuite(alwaysRun=true)
	public void startReporting() {
		System.out.println("Start Reporting & Print Results");	
	}

	@BeforeMethod(alwaysRun=true)
	@Parameters(value = {"browser","url"})
	public void launchBrowserAndLaunchApplication(String browser, String url) {
		System.out.println("Launch the " + browser + " browser");
		System.out.println("maximize the browser window");
		System.out.println("Delete cookies from browser window");
		System.out.println("Launch the application by using URL :"+url);
		System.out.println("Verify the title of the application");
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	@AfterSuite(alwaysRun=true)
	public void stopReporting() {
		System.out.println("Storp Reporting & Generate Report");
	}
	
	@DataProvider(name="loginData")
	public String [][] loginData(){
		String [][] data = {{"Bharath", "bharat123"},{"Invalid", "invalid123"}};
		return data;
	}

}
