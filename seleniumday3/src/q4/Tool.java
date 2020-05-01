package q4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tool {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
	WebElement fName= driver.findElement(By.xpath("//input[@name='firstname']"));
	fName.sendKeys("Abirami");
	WebElement lName= driver.findElement(By.xpath("//input[@id='lastname']"));
	lName.sendKeys("R");
	WebElement subbtn = driver.findElement(By.xpath("//button[@id='buttonwithclass']"));
	subbtn.click();
	WebElement sradio = driver.findElement(By.xpath("//input[@id='sex-1']"));
	sradio.click();
		WebElement yearofexp = driver.findElement(By.xpath("//input[@id='exp-0']"));
		yearofexp.click();
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("09/11/1995");
		WebElement professional = driver.findElement(By.xpath("//input[@id='profession-1']"));
	professional.click();
		WebElement tool = driver.findElement(By.xpath("//input[@id='tool-1']"));
		tool.click();
		WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
		btn.click();	
	}}
