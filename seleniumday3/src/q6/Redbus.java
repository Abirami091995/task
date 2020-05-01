package q6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		login.click();
		WebElement signin = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		signin.click();
		Thread.sleep(5000);
		WebElement phoneno = driver.findElement(By.xpath("//input[@id=\"mobileNoInp\"]"));
		phoneno.sendKeys("1234567890");
		System.out.println("sucess");
		driver.quit();
	}}
