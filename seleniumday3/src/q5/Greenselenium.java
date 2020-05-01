package q5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Greenselenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
WebElement cts = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
cts.click();
}}
