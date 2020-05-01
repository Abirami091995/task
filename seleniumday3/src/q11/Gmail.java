package q11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abirami\\eclipse-workspace\\seleniumday3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?hl=en&flowName=GlifWebSignIn&FlowEntry=SignUp&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		WebElement ca = driver.findElement(By.xpath("//span[text()='Create account']"));
		ca.click();
		driver.quit();

	}

}
