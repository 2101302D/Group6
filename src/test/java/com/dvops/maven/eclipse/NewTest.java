package com.dvops.maven.eclipse;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver webDriver;
	
	@Test
	public void checkId() {
		webDriver.navigate().to("http://localhost:8060/Group6/");
		WebElement we = webDriver.findElement(By.id("welcome"));
	  
	  	System.out.println("id we:" +we.getAttribute("role"));
	  	Assert.assertEquals(we.getAttribute("role"), "welcomeinfo");
	}
 
	@Test
	public void checkTitle() {
		webDriver.navigate().to("http://localhost:8060/Group6/");
	  
		Assert.assertEquals(webDriver.getTitle(), "Home");
		System.out.println("title:"+webDriver.getTitle());
	}
	
	
	@BeforeTest
	public void beforeTest() {
	  	String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
  
	  	System.setProperty("webdriver.chrome.driver", chromeDriverDir);
	  
	  	webDriver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		webDriver.quit();
	}
}
