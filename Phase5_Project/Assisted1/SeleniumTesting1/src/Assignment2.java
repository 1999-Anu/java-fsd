import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
                "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
        //Instantiate WebDriver with ChromeDriver Object
      WebDriver  driver = new ChromeDriver();
      //get() use to open a particular url
      driver.get("https://login.yahoo.com/account/create"); //https://login.yahoo.com
      WebElement textfields=driver.findElement(By.name("firstName"));
      System.out.println(" first name id is :" +textfields.getAttribute("id"));
      WebElement textfields1=driver.findElement(By.name("userId"));
      System.out.println(" user id is :" +textfields1.getAttribute("id"));
      WebElement textfields3=driver.findElement(By.name("password"));
      System.out.println("password id is :" +textfields3.getAttribute("id"));
      WebElement textfields4=driver.findElement(By.name("birthYear"));
      System.out.println(" birthyear id is :" +textfields4.getAttribute("id"));
	}
	

}
