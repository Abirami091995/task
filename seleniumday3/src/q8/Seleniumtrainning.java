package q8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumtrainning {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement material = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
	material.click();
}}
