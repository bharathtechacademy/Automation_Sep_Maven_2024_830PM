package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {
	
	public static void main (String [] args) {
		//Hard Assertions
//		Assert.assertEquals("Google","Google");
//		Assert.assertNotEquals("Google","Google");
//		Assert.assertTrue(true);
//		Assert.assertFalse(false);
//		Assert.assertNull(null);
//		Assert.assertNotNull(123);
//		Assert.fail("Message");
		
		//Soft Assertions
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google","Yahoo");
		softAssert.assertNotEquals("Google","Google");
		softAssert.assertTrue(2>3);
		softAssert.assertFalse(2<3);
		softAssert.assertNull(123);
		softAssert.assertNotNull(null);
		softAssert.fail("Message");
		softAssert.assertAll();
		System.out.println("Execution Completed");
		
		
	}

}
