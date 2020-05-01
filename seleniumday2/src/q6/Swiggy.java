package q6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Swiggy {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/ ");
	WebElement txtuser =driver.findElement(By.id("location"));
	txtuser.sendKeys("T.Nagar");
}
}
