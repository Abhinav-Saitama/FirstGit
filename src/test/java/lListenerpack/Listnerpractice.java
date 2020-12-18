
package lListenerpack;

import org.testng.ITestListener;

import org.testng.ITestResult;

import listpractice.BaseCLass;

public class Listnerpractice extends BaseCLass implements ITestListener {
	
	public void onTestFailure(ITestResult args0) {
		System.out.println("print test failed");
	}

}
