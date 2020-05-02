package AmeriCApPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageObject {
	
	
	WebDriver driver;
	
	public ContactPageObject( WebDriver x) {
		
		driver =x;
		
	}
	
	public WebElement getFirstName() {
		WebElement FirstName = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[1]/div/div[1]/input"));
		return FirstName;
		
	}
	
	public WebElement getLastName() {
		WebElement LastName = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[2]/div/div[1]/input"));
		return LastName;
		
	}
	
	public WebElement getEmail() {
		WebElement Email = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[3]/div/div/input"));
		return Email;
		
	}
	
	public WebElement getAddress() {
		WebElement Address = driver.findElement(By.xpath(""));
		return Address;
		
	}
	
	public WebElement getCity() {
		WebElement City = driver.findElement(By.xpath(""));
		return City;
		
	}
	
	public WebElement getState() {
		WebElement State = driver.findElement(By.xpath(""));
		return State;
		
	}
	
	public WebElement getPhone() {
		WebElement Phone = driver.findElement(By.xpath(""));
		return Phone;
		
	}
	
	public WebElement getAlternatePhone() {
		WebElement AlternatePhone = driver.findElement(By.xpath(""));
		return AlternatePhone;
		
	}
	
	public WebElement getContactMeBy() {
		WebElement ContactMeBy = driver.findElement(By.xpath(""));
		return ContactMeBy;
		
	}
	
	public WebElement getComments() {
		WebElement Comments = driver.findElement(By.xpath(""));
		return Comments;
		
	}
	

}
