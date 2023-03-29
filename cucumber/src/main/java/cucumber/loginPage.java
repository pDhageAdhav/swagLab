package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class loginPage {
	
	WebDriver driver;
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\priti IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
 public void enterUserID() {
	 driver.findElement(By.id("email")).sendKeys("abc@demo.com");
 }
 public void enterPassword() {
	 driver.findElement(By.id("pass")).sendKeys("@1234");
 }
 public void clickLoginButton() {
	 driver.findElement(By.name("login")).click(); 
 }
 public void verifyLogin() {
 System.out.println("login button clicked"); 
 }
}
