package com.alg.mvnproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	public static WebDriver driver = new FirefoxDriver();
	
	
	@Test
	public void test() {
		driver.get("https://www.google.ca");
		System.out.println("########################");
		System.out.println("Test pass");
		driver.quit();
	}
			
			

}
