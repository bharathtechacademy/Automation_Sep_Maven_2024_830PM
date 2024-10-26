package language.basics;

public class Methods {
	
	//method (function) ==> block of code / collection of statements  ==> can reduce duplicate code and also we can standardize the code
	
	//method inside the method not allowed

	public static void main(String[] args) {
		
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url www.icici.com and launch application");
		System.out.println("Enter username and password");
		System.out.println("Click on Login button");
		
		System.out.println("Execute Test Case 1 Steps for validating home page....");
		
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		System.out.println("Publish the test result");
		System.out.println();
		
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url www.icici.com and launch application");
		System.out.println("Enter username and password");
		System.out.println("Click on Login button");
		
		System.out.println("Execute Test Case 2 Steps for validating fund transfer....");
		
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		System.out.println("Publish the test result");
		System.out.println();
		
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url www.icici.com and launch application");
		System.out.println("Enter username and password");
		System.out.println("Click on Login button");
		
		System.out.println("Execute Test Case 2 Steps for validating mini statement....");
		
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		System.out.println("Publish the test result");
		System.out.println();
	}
	
	
	void launchBrowserAndLoginIntoApplication(){
		System.out.println("Launch the chrome browser");
		System.out.println("Enter url www.icici.com and launch application");
		System.out.println("Enter username and password");
		System.out.println("Click on Login button");		
	}
	
	void logoutFromAppAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		System.out.println("Publish the test result");
		System.out.println();
	}
	

}
