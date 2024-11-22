package framework.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestMethods extends TestNGCommonMethods{
		
	@Test(priority=2,groups= {"sanity"},dependsOnMethods= {"verifyContactInformation"})
	public void verifyLogoAndCaption() {
		System.out.println("Verify application Logo");
		System.out.println("Verify application Caption");
	}

	@Test(priority=3,groups= {"sanity","regression"})
	public void verifyContactInformation() {
//		Assert.fail("Contact Info Failed...");
		System.out.println("Verify application contatct information");
		
	}
	
	@Test(dataProvider="loginData",priority=1,groups= {"regression"},enabled=false)
	public void verifyLogin(String username, String password){
		System.out.println("Enter username as : "+username);
		System.out.println("Enter password as : "+password);
		System.out.println("Click on Login button");
	}
	
}
