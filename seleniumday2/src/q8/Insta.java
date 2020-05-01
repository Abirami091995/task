package q8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Insta {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/ ");
	WebElement txtuser =driver.findElement(By.id("email"));
	txtuser.sendKeys("saprinabi@gmail.com");
	WebElement txtpass =driver.findElement(By.id("pass"));
	txtpass.sendKeys("1232456");	
}
}
