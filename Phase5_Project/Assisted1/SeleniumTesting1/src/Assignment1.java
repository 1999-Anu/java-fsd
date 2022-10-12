import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
                "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");

		WebDriver  driver = new ChromeDriver();
	      //get() use to open a particular url
	      driver.get("https://www.flipkart.com/"); //https://login.yahoo.com
	     System.out.println("The title of the page is " + driver.getTitle());
	       WebElement searchIcon = driver.findElement(By.id("container"));//id locator for next button
	       //searchIcon.click();
	       System.out.println(searchIcon.getAttribute("title"));
	   WebElement element = driver.findElement(By.name("q"));
	        searchIcon.click();
	    System.out.println(element.getAttribute("value"));
	    
	    WebElement textfields=driver.findElement(By.tagName("input"));
	      System.out.println(textfields.getAttribute("class"));
	}

}
