package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyTitleOfWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		// ***** VERIFY TITLE OF WEB PAGE *****

		String actualRult = driver.getTitle();
		System.out.println("Title of WebPage :--> " + actualRult);

		String expRult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		Assert.assertEquals(actualRult, expRult);
		
		System.out.println("verified");

		
	}

}
