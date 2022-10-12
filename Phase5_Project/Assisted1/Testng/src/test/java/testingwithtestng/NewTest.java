package testingwithtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
      driver.get("http://login.yahoo.com/");
      driver.findElement(By.id("login-username")).sendKeys("anuchitra99@yahoo.in"); //id locator for text box
      WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
     searchIcon.click();
      }
  @BeforeMethod
  public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver",
              "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
       driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	
  }

}
