package com.selenium.seleniumproject3;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Itestlistener.class)
public class itestexample {
	
	@Test
	public void m1() {
		Assert.assertTrue(true);
	}
	@Test
	public void m2() {
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods="m2")
	public void m3() {
		Assert.assertTrue(true);
	}

}
