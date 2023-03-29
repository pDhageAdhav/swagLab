import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest {

	public String baseURL = "https://www.saucedemo.com/";
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		
	}

	@Test
	public void LoginForInvalidUserAndPass_TC_01() throws Exception {
		// check login for invalid user and password
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("Standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);

	}

	@Test
	public void LoginForValidUserAndInvalidPass_TC_02() throws Exception {
		// check login for valid user and invalid password
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@Test
	public void LoginForInvalidUserAndValidPass_TC_03() throws Exception {
		// check login for invalid user and valid password
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("Standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@Test
	public void LoginForValidUserAndValidPass_TC_04() throws Exception {
		// check login for valid user and valid password
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void close() throws Exception {

		driver.close();
	}

}
