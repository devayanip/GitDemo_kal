package com.test.Git_Kal;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Kal_git {
	
	WebDriver driver;
  @Test
  public void f() 
  {
	  driver.findElement(By.name("email")).sendKeys("sonalisa");
	  
	  driver.findElement(By.name("pass")).sendKeys("abcdef");
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.facebook.com/");
  }

  @AfterClass
  public void afterClass() 
  {
	 driver.quit(); 
  }

}
