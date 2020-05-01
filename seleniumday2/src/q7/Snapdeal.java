package q7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Snapdeal {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/login ");
	WebElement txtuser =driver.findElement(By.id("userName"));
	txtuser.sendKeys("saprinabi@gmail.com");	
}
}
