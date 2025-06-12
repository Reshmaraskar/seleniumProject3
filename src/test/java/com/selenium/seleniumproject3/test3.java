package com.selenium.seleniumproject3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {
	@Parameters({"myname", "pass"})
	@Test
	public void m2(String u, String p) {
		System.out.println("m1........test3"+ u+ " "+p);
	}

}
