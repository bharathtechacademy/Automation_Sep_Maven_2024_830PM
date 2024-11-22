package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {
		
		CommonMethods commons = new CommonMethods();
		ApplicationMethods app = new ApplicationMethods();		
		
		commons.startReporting();
		commons.launchBrowser("Chrome");
		commons.launchApplication("www.abc-bank.com");
		app.verifyLogoAndCaption();
		commons.closeBrowser();
		
		commons.launchBrowser("Chrome");
		commons.launchApplication("www.abc-bank.com");
		app.verifyContactInformation();
		commons.closeBrowser();
		
		commons.launchBrowser("Chrome");
		commons.launchApplication("www.abc-bank.com");
		commons.loginIntoApplication("Bharath", "bharat123");
		app.verifyLoginSuccessful();
		app.logoutFromApplication();
		commons.closeBrowser();
		
		commons.launchBrowser("Chrome");
		commons.launchApplication("www.abc-bank.com");
		commons.loginIntoApplication("Invalid", "invalid123");
		app.verifyLoginError();
		commons.closeBrowser();
		
		commons.stopReporting();

	}

}
