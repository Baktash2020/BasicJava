package AmericanCapitalTestScripts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmeriCApPageObjects.ContactPageObject;

public class Contacts {
	
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
    public void ValidateTextBoxes(){
		CPO.getFirstName().sendKeys("Sabrina");
		CPO.getLastName().sendKeys("Ahmad");
		CPO.getEmail().sendKeys("Sabrina@gmail.com");
        
		
	}
	
	@Test 
    public void ValidateEmailAdd(){
		
		WebElement Email = driver.findElement(By.linkText("info@amcfg.com"));
		boolean EmailAdd = Email.isEnabled();
		
		Assert.assertTrue(EmailAdd);
		
	}
	
	@Test 
    public void ValidateEmailAdd1(){
		
		WebElement Email = driver.findElement(By.linkText("info@amcfg.com"));
		boolean EmailAdd = Email.isEnabled();
		
		String ActualEmailText = Email.getText();
		String ExpectedText = "info@amcfg.com";
		
		Assert.assertEquals(ActualEmailText, "info@amcfg.com");
		
	}
	
	@Test 
    public void ValidateAccessibilityMenue() throws InterruptedException{
		
		WebElement AccMenue = driver.findElement(By.linkText("Accessbility Menu"));
		boolean AccessabilityMenue = AccMenue.isDisplayed();
		String ActualText = AccMenue.getText();
		String ExpectedText= "AccMenue";
		
		Assert.assertEquals(ExpectedText, ExpectedText);
		
		
		
		Thread.sleep(10000);
		
	}
	
	
	@AfterTest
	public void CloseThePage(){
		driver.quit();
		
	}
}
