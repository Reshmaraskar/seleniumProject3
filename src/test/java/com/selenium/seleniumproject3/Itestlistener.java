package com.selenium.seleniumproject3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Itestlistener implements ITestListener{

	public void onFinish(ITestContext context) {
		
		System.out.println("onFinish");
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestSuccess"+ result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestSuccess"+ result
				);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSuccess" +result
				);
	}

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart"+ result);
	}

	public void onTestSuccess(ITestResult result ) {
		System.out.println("onTestSuccess" +result);
	}

}
