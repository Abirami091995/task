package q10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday3\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement sign=driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"));
	sign.click();
	WebElement sigin=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	sigin.click();
	WebElement name =driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
name.sendKeys("Abirami R");
	WebElement phno=driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	phno.sendKeys("8778157161");
	WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
	email.sendKeys("saprinabi@gmail.com");
	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password.sendKeys("Teddyrose");
WebElement btn=driver.findElement(By.xpath("//input[@id='continue']"));
btn.click();
}}
