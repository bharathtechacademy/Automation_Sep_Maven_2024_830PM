package absPack;

public abstract class AbsClass1 {
	
	//abstract ==> method and class 
	//abstract ==> high-level information
	
	
	//method with parameters
	abstract void launchBrowserAndLoginIntoApplication(String browser, String username, String password);
	
	public abstract void login(String username, String password);
	
	//method without return type /method without parameters
	void logoutFromAppAndCloseBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
		System.out.println("Publish the test result");
		System.out.println();
	}
	
	//method with return type
	double getAccountBalance(){
		System.out.println("naviagate to accounts section");
		System.out.println("copy account balance");
		double balance = 1000.5;	
		return balance;
	}
	


}
