package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void Beforetest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.amcfg.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void validateURL() {
		driver.findElement(By.linkText("Contact")).click();
		
		String expectedTitle = "Contact";
		String expectedUrl = "https://www.amcfg.com/contact-us/";
		
		String actualTitle = driver.getTitle();
		String actualUrl =driver.getCurrentUrl();
		
		Assert.assertEquals("Contact", "Contact");
		Assert.assertEquals("https://www.amcfg.com/contact-us/", "https://www.amcfg.com/contact-us/");
		
		
	}
	
	@AfterTest
	public void Aftertest() {
		driver.quit();
		
	}

}
