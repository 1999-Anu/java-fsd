package testingwithtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FetchInput{
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
              "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
	  	//Instantiate WebDriver with ChromeDriver Object
	  	WebDriver  driver = new ChromeDriver();
	  
	  	driver.get("https://login.yahoo.com/account/create");
      
	  	//Fetch all input Elements from current web page 
	  	List<WebElement> allInputElements=driver.findElements(By.tagName("input"));
	  	for(WebElement e : allInputElements)
          System.out.println("Input box id="+e.getAttribute("id"));// <input type="" id="">
	  	driver.quit();
  }
}