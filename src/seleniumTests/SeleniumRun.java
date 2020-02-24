package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRun {

	public static void main(String[] args) throws InterruptedException {
      
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amcfg.com/");
		driver.manage().window().maximize();
		Thread.sleep(30);
		driver.quit();
		
		
		

	}

}
