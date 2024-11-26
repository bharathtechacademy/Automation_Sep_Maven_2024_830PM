package framework.concepts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started for Test Case "+result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution is Successful for Test Case "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution is Failed for Test Case "+result.getMethod().getMethodName());
		System.out.println("Take Screenshot for Test Case "+result.getMethod().getMethodName());
		System.out.println("Test Execution is Failed for Test Case due to "+result.getThrowable().getMessage());
	}

}
