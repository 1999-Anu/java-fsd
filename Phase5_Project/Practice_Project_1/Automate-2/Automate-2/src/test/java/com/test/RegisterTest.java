package com.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RegisterTest {
	WebDriver chrome;
	  @Test(priority = 1)
	  public void register() {
		  
		  chrome.get("http://automationpractice.com/index.php");
		  WebElement registerbtn= chrome.findElement(By.className("login"));
		  registerbtn.click();
		  WebElement email= chrome.findElement(By.id("email_create"));
		  email.sendKeys("anuchitrac@gmail.com");
		  WebElement create= chrome.findElement(By.id("SubmitCreate"));
		  create.click();
		  
		  chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  
		  WebElement title = chrome.findElement(By.cssSelector("label[for='id_gender1']"));
		  title.click();
		  
		  WebElement firstName = chrome.findElement(By.id("customer_firstname"));
		  firstName.sendKeys("Anu");
		  WebElement lastName = chrome.findElement(By.id("customer_lastname"));
		  lastName.sendKeys("Chitra");
		  WebElement password = chrome.findElement(By.id("passwd"));
		  password.sendKeys("developer");
		  
		  Select day= new Select(chrome.findElement(By.id("days")));
		  day.selectByValue("3");
		  Select month= new Select(chrome.findElement(By.id("months")));
		  month.selectByValue("8");
		  Select year= new Select(chrome.findElement(By.id("years")));
		  year.selectByValue("1999");
		  
//		  WebElement fname = chrome.findElement(By.id("firstname"));
//		  fname.sendKeys("Anu");
//		  WebElement lname = chrome.findElement(By.id("lastname"));
//		  lname.sendKeys("Chitra");
		  WebElement add = chrome.findElement(By.id("address1"));
		  add.sendKeys("Srivilliputhur");
		  WebElement city = chrome.findElement(By.id("city"));
		  city.sendKeys("Srivilliputhur");
		  
		  Select state= new Select(chrome.findElement(By.id("id_state")));
		  state.selectByValue("14");
		  
		  WebElement postcode = chrome.findElement(By.id("postcode"));
		  postcode.sendKeys("626126");
		  WebElement phno = chrome.findElement(By.id("phone_mobile"));
		  phno.sendKeys("9876543210");
		  
		  WebElement acsubmit = chrome.findElement(By.id("submitAccount"));
		  acsubmit.click();
	
	
		  }
	  
	  
	  	@Test(priority = 2)
	  public void login()
	  {
	  		chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  		 chrome.get("http://automationpractice.com/index.php");
			  WebElement btn= chrome.findElement(By.className("login"));
			  btn.click();
			  
			  WebElement email= chrome.findElement(By.id("email"));
			  email.sendKeys("anuchitrac@gmail.com");
			  
			  WebElement password= chrome.findElement(By.id("passwd"));
			  password.sendKeys("developer");
			  
			  WebElement login= chrome.findElement(By.id("SubmitLogin"));
			  login.click();
			  System.out.println(chrome.getCurrentUrl());
			  assertEquals(chrome.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account","Invalid credentials");
			  
			  
			  
			  
	  }
	  	
	  	@Test(priority = 3)
	  	public void search()
	  	{
	  		
	  		chrome.findElement(By.id("search_query_top")).sendKeys("shirt");
	  		chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  		chrome.findElement(By.name("submit_search")).click();
	  	}
	  	
	  	@Test(priority = 4)
	  	public void addToCart()
	  	
	  	{
	  		
	  		
	  		chrome.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=shirt&results=1");
	  		chrome.findElement(By.name("Submit")).click();
	  		//chrome.findElement(By.className("product-name")).click();
	  	}
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  chrome.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver",
	                "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
		  chrome = new ChromeDriver();
		  chrome.manage().window().maximize();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  
	  }
	  

}
