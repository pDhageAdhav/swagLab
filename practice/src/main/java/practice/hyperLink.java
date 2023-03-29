package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLink {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ujwal\\eclipse-workspace\\priti\\com.facebook.drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.get("https://www.flipkart.com/");
         System.out.println("Page Title = " + driver.getTitle());
         System.out.println("windowHandle = " + driver.getWindowHandle());
         System.out.println("Currentpage URL  = " + driver.getCurrentUrl());
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Top Offers")).click();
         Thread.sleep(2000);
         driver.close();
	}

}
