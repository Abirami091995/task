package q7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cleartrip {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/register");
	WebElement Email = driver.findElement(By.xpath("//input[@id='username1']"));
	Email.sendKeys("saprinabi@gmail.com");
	WebElement btn = driver.findElement(By.xpath("// button[@id='registerButton']"));
	btn.click();
	Thread.sleep(5000);
	WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("Teddyrose6@");
	WebElement Fname= driver.findElement(By.xpath("//input[@name='first_name']"));
	Fname.sendKeys("Abirami");
	WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
	Lname.sendKeys("R");
	WebElement phno = driver.findElement(By.xpath("//input[@name='phone_number_value']"));
	phno.sendKeys("8778157161");
	WebElement btn1 = driver.findElement(By.xpath("//button[@id='signUpButton']"));
	btn1.click();	
}}
