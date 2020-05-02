package AmericanCapitalTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmeriCApPageObjects.AboutUsP;
import AmeriCApPageObjects.ContactPageObject;


public class AboutUs {
	
	WebDriver driver;
	
	AboutUsP AUP;
	
	@BeforeTest
	public void ValidateAboutUs () throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		
		AUP = new AboutUsP (driver);
		driver.manage().window().maximize();
		
		driver.get("https://www.amcfg.com/about-us/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterTest
	public void CloseTest () {
		
		driver.quit();
	}
	
	@Test
	public void ValidateAboutU(){
		
		AUP.getFirstName().sendKeys("Sabrina");
		AUP.getLastName().sendKeys("Ahmad");
		AUP.getEmail().sendKeys("Sabrina@gmail.com");
		AUP.getHomePhone().sendKeys("5716754908");
		AUP.getLoanAmount().isSelected();
	}
	

}
