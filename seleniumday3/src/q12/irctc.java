package q12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class irctc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday3\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	WebElement login = driver.findElement(By.xpath("//a[@id='loginText']"));
	login.click();
	System.out.println("a");
	driver.quit();
}
}
