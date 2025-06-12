package com.selenium.seleniumproject3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exelToDataprovider {
	@DataProvider
	public Object[][] data() throws IOException {
		
		
		
		File f = new File("C:\\Users\\DELL\\Pictures\\practice\\testing.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
	   Sheet sh =  wb.getSheet("sheet2");
	   int lastrow= sh.getLastRowNum();
	   int lastcell = sh.getRow(0).getLastCellNum();
	   Object[][] obj = new Object[lastrow+1][lastcell];
	   
	   for(int i =0; i<=lastrow; i++) {
		   for(int j=0; j<lastcell; j++) {
			   
		obj[i][j]=	   sh.getRow(i).getCell(j).getStringCellValue();
		   }
	   }
	return obj;

	}

	@Test(dataProvider = "data")
	public void login(String uname, String pass) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username= driver.findElement(By.xpath("//input[@id=\"email\"]"));
		username.sendKeys(uname);
		Thread.sleep(2000);
		
		WebElement password= driver.findElement(By.xpath("//input[@id=\"pass\"]"));
			password.sendKeys(pass);
			Thread.sleep(2000);		
			
		
	}

	
}
