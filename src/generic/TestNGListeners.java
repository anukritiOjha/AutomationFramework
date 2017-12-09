package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	//object of BaseClass to take and save the screenshot
	BaseClass b=new BaseClass();

	
	public void onTestStart(ITestResult result) {	}

	
	public void onTestSuccess(ITestResult result) {	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testmethodname=result.getName();		//this will return the method that fails
		b.takeScreenshot(testmethodname);

	}

	
	public void onTestSkipped(ITestResult result) {  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	}

	public void onStart(ITestContext context) {	}

	public void onFinish(ITestContext context) {	}

}
