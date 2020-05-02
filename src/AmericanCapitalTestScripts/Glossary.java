package AmericanCapitalTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmeriCApPageObjects.AboutUsP;
import AmeriCApPageObjects.GlossaryP;

public class Glossary {
	
	
     WebDriver driver;
     GlossaryP GP;


	@BeforeTest
	public void ValidateAboutUs () throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GP = new GlossaryP (driver);
		driver.manage().window().maximize();
		
		driver.get("https://secure-apps.smartapp1003.com/201132/?loanofficerid=0");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterTest
	public void CloseTest () {
		
		driver.quit();
	}
	
	@Test
	public void ApplyNow () throws InterruptedException{
		//GP.getApplyNow().click();
		//Thread.sleep(3000);
		GP.getGetStartedNow().isSelected();
		Thread.sleep(3000);
		GP.getFirstName().sendKeys("Sabrina");
		GP.getLastName().sendKeys("Sabrina");
		GP.getEmail().sendKeys("SabrinaSabrina");
		GP.getConfirmEmail().sendKeys("SabrinaSabrina");
		GP.getPassword().sendKeys("789067");
		GP.getBestContactNumber().sendKeys("6789765");
	
		
		
		
	}

}
