package language.basics;

import java.lang.reflect.Method;

public class Methods2 {
	
	//method (function) ==> block of code / collection of statements  ==> can reduce duplicate code and also we can standardize the code
	
	//method inside the method not allowed
	
	//types of methods 
	
	//method without return type (void methods)
	//method with return type
	//method with parameters/arguments 
	//method without parameters
	//constructor method (default constructor /parameterized constructor)
	
	//method with same name as class name and without having any return type
	
	//constructor method ==> to create object and to initialize all the data /methods 
	
	//default constructor
	Methods2(){
		
	}
	
	//parameterized constructor
	Methods2(String browser){
		
	}

	public static void main(String[] args) {
		
		Methods2 obj = new Methods2();
		
		obj.launchBrowserAndLoginIntoApplication("chrome","siva","siva123");
		System.out.println("Execute Test Case 1 Steps for validating home page....");		
		obj.logoutFromAppAndCloseBrowser();
		
		obj.launchBrowserAndLoginIntoApplication("chrome","bharath","bharath123");
		System.out.println("Execute Test Case 1 Steps for validating home page....");		
		obj.logoutFromAppAndCloseBrowser();
		
		obj.launchBrowserAndLoginIntoApplication("edge","siva","siva123");		
		System.out.println(obj.getAccountBalance());
		System.out.println("Execute Test Case 2 Steps for validating fund transfer....");
		obj.logoutFromAppAndCloseBrowser();
		
		obj.launchBrowserAndLoginIntoApplication("firefox","siva","siva123");		
		System.out.println("Execute Test Case 2 Steps for validating mini statement....");
		obj.logoutFromAppAndCloseBrowser();
	}
	
	//method with parameters
	void launchBrowserAndLoginIntoApplication(String browser, String username, String password){
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url www.icici.com and launch application");
		System.out.println("Enter "+username+" and "+password);
		System.out.println("Click on Login button");		
	}
	
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
