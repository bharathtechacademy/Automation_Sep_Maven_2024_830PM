package framework.concepts;

public class CommonMethods {
	
	public void startReporting() {
		System.out.println("Start Reporting & Print Results");	
	}

	public void launchBrowser(String browser) {
		System.out.println("Launch the " + browser + " browser");
		System.out.println("maximize the browser window");
		System.out.println("Delete cookies from browser window");
	}

	public void launchApplication(String url) {
		System.out.println("Launch the application by using URL :"+url);
		System.out.println("Verify the title of the application");
	}
	
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	
	public void loginIntoApplication(String username, String password) {
		System.out.println("Enter username as : "+username);
		System.out.println("Enter password as : "+password);
		System.out.println("Click on Login button");
	}
	
	public void stopReporting() {
		System.out.println("Storp Reporting & Generate Report");
	}

}
