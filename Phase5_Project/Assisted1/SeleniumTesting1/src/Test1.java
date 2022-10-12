import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	private static String value;

	public static void main(String[] args) {
		//set path of chrome web driver
		System.setProperty("webdriver.chrome.driver",
                "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
        //Instantiate WebDriver with ChromeDriver Object
      WebDriver  driver = new ChromeDriver();
      //get() use to open a particular url
      driver.get("https://login.yahoo.com"); //https://login.yahoo.com
     // System.out.println("The title of the page is" + driver.getTitle());
      // WebElement searchIcon = driver.findElement(By.id("login-signin"));//id locator for next button
       //searchIcon.click();
       //System.out.println(searchIcon.getAttribute(value));
      //WebElement searchIcon = driver.findElement(By.name("signin"));
        //searchIcon.click();
    //System.out.println(searchIcon.getAttribute("value"));
     WebElement textfields=driver.findElement(By.tagName("input"));
      System.out.println(textfields.getAttribute("class"));
      
      //System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\Downloads\\edgedriver_win64/msedgedriver.exe");

}}
