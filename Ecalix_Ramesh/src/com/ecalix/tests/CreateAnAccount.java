package com.ecalix.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecalix.common.CommonMethods;

public class CreateAnAccount{
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://107.170.213.234/catalog/");
		
	}
	
	@Test
	public void CreateAnAccount01(){


	 
	}
	
	@Test
	public void CreateAnAccount02(){
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.name("email_address")).sendKeys("ecalix");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[1]")).click();
		String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
	    String ExpectedText="Welcome to iBusiness";
	    Assert.assertEquals(ActualText, ExpectedText);

	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
}