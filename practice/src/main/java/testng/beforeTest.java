package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforeTest {
	public String baseUrl = "https://www.facebook.com/";
	WebDriver driver;

	// Before TEST run all test on same web page one by one
	
	@BeforeTest
	public void openWeb() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	// **** send data to email id field ****
	@Test
	public void sendDataToEmail() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("user1");
	}
	// **** send data to password id field ****
	@Test
	public void sendDataToPassword() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456");
	}
	// **** Verify title of webPage ****
	@Test
	public void verifyTitleOfWebPage() {
		String actualTitle = driver.getTitle();
		System.out.println("Page Title is :--> " + actualTitle);

		String ExpRult = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, ExpRult);
		System.out.println("Verified");

	}
	// **** SCROLL BY METHOD FOR SCROLLING WEBPAGE ****
	@Test
	public void ScrollPage() throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)", " ");

	}

}
