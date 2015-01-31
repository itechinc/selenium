package com.ecalix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecalix.common.CommonMethods;

public class LoginPage  {
	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	public void enterUserName(String UserName){
		driver.findElement(By.name("email_address")).sendKeys(UserName);
		System.out.println("Username entered");
	}
	
	public void clickLogYoursefIn(){
		//driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		System.out.println("log your self LInk clicked");
	}
	
	public void enterPassword(String password){
		driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("pwd entered");
	}
	
	public void clickSignIn(){
		driver.findElement(By.xpath("//*[@id='tdb5']/span[1]")).click();
		System.out.println("click signin");
	}
	
	public void clickLogOff(){
	    driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
	    System.out.println("click logoff");
	}

}
