package com.selenium.seleniumproject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@DataProvider
	public Object[][]data() {
		Object[][] obj = new Object[2][2];
		obj[0][0]= "username";
		obj[0][1]="pass";
		
		obj[1][0]= "Reshma";
		obj[1][1]="Reshmma@123";
		
	return obj;
		
}
	@Test(dataProvider= "data")
	public void m1(String uname, String pass) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.xpath("//input[@id=\"email\"]"));
		username.sendKeys(uname);
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.xpath("//input[@id=\"pass\"]"));
			password.sendKeys(pass);
			Thread.sleep(2000);
			
		
		
		
		
		
	}

}
