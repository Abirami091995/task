package q4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Icici {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp ");
		WebElement txtuser =driver.findElement(By.xpath("//input[@class='login-input mode-select-userid']"));
		txtuser.sendKeys("saprinabi95");	
	}
	}
