package AmericanCapitalTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmeriCApPageObjects.PurchaseContactInfoP;

public class PurchaseContactInformation {
	
	
    WebDriver driver;
    PurchaseContactInfoP PCIP;
	
	@BeforeTest
	public void ValidateAboutUs () throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		PCIP =new PurchaseContactInfoP (driver);
		driver.manage().window().maximize();
		
		driver.get("https://www.amcfg.com/home-purchase/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterTest
	public void CloseTest () {
		
		driver.quit();
	}
	
	@Test
	public void ValidatPurchaseContactInfo(){
		
		PCIP.getBestTimeContact().isSelected();
		PCIP.getFirstName().sendKeys("Zarmina");
		PCIP.getLastName().sendKeys("Rajabee");
		PCIP.getEmail().sendKeys("Zarmina@yahoo.com");
		PCIP.getHomePhone().sendKeys("571 332 4299");
		PCIP.getAltPhone().sendKeys("703 543 8765");
		
	}

}
