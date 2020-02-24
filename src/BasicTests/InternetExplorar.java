package BasicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorar {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.ie.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\IEDriverServer.exe");
		
		WebDriver driver= new InternetExplorerDriver(); 
		
		driver.get("https://www.amcfg.com/");
		driver.manage().window().maximize();
		Thread.sleep(30);
		driver.quit();
		
		

	}

}
