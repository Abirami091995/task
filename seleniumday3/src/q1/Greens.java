package q1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement contactBtn = driver.findElement(By.xpath("//a[@href='contact.php']"));
		contactBtn.click();
		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("Abirami");
		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("saprinabi@gmail.com");
		WebElement phno = driver.findElement(By.name("phone"));
		phno.sendKeys("8778157161");
		WebElement message = driver.findElement(By.name("comments"));
		message.sendKeys("give a inform");
		WebElement subbtn = driver.findElement(By.name("submit"));
		subbtn.click();		
	}}

