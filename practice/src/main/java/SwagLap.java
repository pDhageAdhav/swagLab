import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLap {

	public String baseURL = "https://www.saucedemo.com/";
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          driver.get(baseURL);
	}
	
	@Test 
	public void LoginPageInfo_TC_01() {
		System.out.println("The Current URL Is = " + driver.getCurrentUrl());
		System.out.println("The Current page Name/Title is = " + driver.getTitle());
	}
	@Test 
	public void verifyPageName_TC_02() {
		String exp = "Swag Labs";
		String act = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		Assert.assertEquals(act, exp);
		System.err.println("Assert verified for TC_02");
		
	}
	
	@Test 
	public void LoginPage_TC_03() throws Exception {
		// verify login button is clickable
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		String exp = "Epic sadface: Username is required";
		String act = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		System.out.println(act);
		Assert.assertEquals(act, exp);
		System.err.println("Assert verified for Tc_03");
		
	}
	
	@Test 
	public void LoginPage_TC_04() throws Exception {
		// login button error message cross button is clickable
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='error-button']")).isEnabled();
		driver.findElement(By.xpath("//button[@class='error-button']")).click();
		
	}
	
}
