package com.dvops.maven.eclipse;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardJSPTest {
	private WebDriver webDriver;
	 @Test
	 public void testCard() {
		 webDriver.navigate().to("http://localhost:8090/Group6/keyboards_servlet");
		 WebElement card = webDriver.findElement(By.className("card"));
		 Assert.assertTrue(card.isDisplayed());
  }
	 @Test
	 public void testNavBar() {
		 webDriver.navigate().to("http://localhost:8090/Group6/keyboards_servlet");
		 WebElement navBar = webDriver.findElement(By.className("topnav"));
		 Assert.assertTrue(navBar.isDisplayed());
	 }
	 
	 @Test
	 public void testContainer() {
		 webDriver.navigate().to("http://localhost:8090/Group6/keyboards_servlet");
		 WebElement container = webDriver.findElement(By.className("container"));
		 Assert.assertTrue(container.isDisplayed());
	 }
	 
	 @Test
	 public void testRow() {
		 webDriver.navigate().to("http://localhost:8090/Group6/keyboards_servlet");
		 WebElement row = webDriver.findElement(By.className("row"));
		 Assert.assertTrue(row.isDisplayed());
	 }
  @BeforeTest
  public void beforeTest() {
	  String chromeDriveDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromeDriveDir);
	  webDriver = new ChromeDriver();
  }
  
  @AfterTest
  public void afterTest() {
	  webDriver.close();
  }

}
