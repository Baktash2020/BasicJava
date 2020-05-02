package AmericanCapitalTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmeriCApPageObjects.ContactPageObject;
import junit.framework.Assert;


public class ValidateHomePage {
	
	WebDriver driver;
	ContactPageObject CPO;
	
	
	@BeforeTest
	public void Contact() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		CPO= new ContactPageObject(driver);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.amcfg.com/contact-us/");
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	}
	
	@Test 
	public void ValidateURL () {
		String ActualURL = driver.getCurrentUrl();
		String ExpectedURL = "https://www.amcfg.com/contact-us/";
		
		Assert.assertEquals("https://www.amcfg.com/contact-us/", ActualURL);
		
		
		
	}
	
	@Test 
	public void ValidateTitle () {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Contact Us";
		
		//System.out.println(ActualTitle);
		
		Assert.assertEquals("Contact Us", ActualTitle);
		
		
		
	}
	
	@AfterTest 
	public void CloseTest () {
		
		driver.quit();
	}
	
	

}
