package q2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday2\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.redbus.in/ ");
		WebElement txtuser =driver.findElement(By.id("src"));
		txtuser.sendKeys("chennai");
		WebElement txtpass =driver.findElement(By.id("dest"));
		txtpass.sendKeys("karaikudi");	
}


}
