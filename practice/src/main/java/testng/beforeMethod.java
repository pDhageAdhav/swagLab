package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeMethod {

	public String baseUrl = "https://www.facebook.com/";
	WebDriver driver;
    
	// Before method open new window for new test run
	
	@BeforeMethod
	public void openWeb() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void sendDataToEmail() throws Exception {
		driver.findElement(By.id("email")).sendKeys("user1");
		Thread.sleep(2000);
	}

	@Test
	public void sendDataToPassword() throws Exception {
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(2000);
	}

	@Test
	public void verifyTitleOfWebPage() throws Exception {
		String actualTitle = driver.getTitle();
		System.out.println("Page Title is :--> " + actualTitle);

		String ExpRult = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, ExpRult);
		System.out.println("Verified");
		Thread.sleep(2000);

	}

	@Test
	public void ScrollPage() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", " ");
		Thread.sleep(2000);

	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
