package q3;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Demo {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\sample\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
WebElement fName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fName.sendKeys("Abirami");
		WebElement lName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lName.sendKeys("R");
		WebElement Add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		Add.sendKeys("karaikudi ");
		WebElement eMail = driver.findElement(By.xpath("//input[@type='email']"));
		eMail.sendKeys("saprinabi@gmail.com");
		WebElement phNo = driver.findElement(By.xpath("//input[@type='tel']"));
		phNo.sendKeys("8778157161");
		WebElement rBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		rBtn.click();
		WebElement cBtn = driver.findElement(By.id("checkbox1"));
		cBtn.click();
		WebElement lBtn = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		lBtn.click();
	WebElement txtpass= driver.findElement(By.xpath("//input[@id='firstpassword']"));
	txtpass.sendKeys("123456");
	WebElement ctxtpass= driver.findElement(By.xpath("//input[@id='secondpassword']"));
	ctxtpass.sendKeys("123456");
	WebElement sBtn= driver.findElement(By.xpath("//button[@id='submitbtn']"));
	sBtn.click();		
}}
