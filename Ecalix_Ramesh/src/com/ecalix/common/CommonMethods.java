package com.ecalix.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	private WebDriver driver;
	
	public WebDriver openBrowser(){
		driver=new FirefoxDriver();
		System.out.println("Open Browser");
		return driver;
	}
	
	public void closeBrowser(){
		driver.quit();
		System.out.println(" Browser closed");
	}
	
	public void openUrl(){
		driver.get("http://107.170.213.234/catalog/");
		System.out.println("Open URL");
	}



}
