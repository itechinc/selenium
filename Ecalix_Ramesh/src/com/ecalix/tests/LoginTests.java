package com.ecalix.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecalix.common.CommonMethods;
import com.ecalix.pages.LoginPage;

public class LoginTests  {

	private WebDriver driver;
	CommonMethods CM;
	
	@BeforeMethod
	public void setUp(){
	 CM=new CommonMethods();
		driver=CM.openBrowser();
	    CM.openUrl();
		
	}
	
	@Test
	public void Login01(){
		 LoginPage LP=new LoginPage(driver);
		 LP.clickLogYoursefIn();
		 LP.enterUserName("ecalix@test.com");
		 LP.enterPassword("test123");
		 LP.clickSignIn();
		 LP.clickLogOff();
	
	
	
	 
	}
	
	@Test
	public void Login02(){
		//clickLogYoursefIn();
		
//		   LoginPage LP=new LoginPage();
//			 LP.clickLogYoursefIn();
//			 LP.enterUserName();
//			 LP.enterPassword();
//			 LP.clickSignIn();
//		String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
//	    String ExpectedText="Welcome to iBusiness";
//	    Assert.assertEquals(ActualText, ExpectedText);

	}
	
	@AfterMethod
	public void tearDown(){
		CM.closeBrowser();
		
	}

}
