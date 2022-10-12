
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "C:\\\\Users\\\\ADMIN\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		
		
		 
		 //create an account
		 wb.get("https://codingbat.com/java");
		 Thread.sleep(5000);
		 
		 wb.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/a[2]")).click();
		 
		 Thread.sleep(5000);
		 //send values 
		 wb.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("abcd1@gmail.com");
		 wb.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("abcdef");
		 wb.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).click();
		 
		 Thread.sleep(5000);
		 //logout 
		 wb.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/a")).click();
		 
		 Thread.sleep(5000);
		 // again login
		 wb.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("abcd1@gmail.com");
		 wb.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/input")).sendKeys("abcdef");
		 wb.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[3]/td[2]/input")).click();
}
}