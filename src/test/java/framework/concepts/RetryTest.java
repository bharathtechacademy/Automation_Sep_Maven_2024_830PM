package framework.concepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer{
	
	int count =0;
	int maxRetryCount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(count<maxRetryCount) {
				count++;
				return true;
			}			
		}
		
		return false;
	}

}
