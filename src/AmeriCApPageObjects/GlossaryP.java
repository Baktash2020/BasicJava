package AmeriCApPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlossaryP {
	
     WebDriver driver;
	
	public GlossaryP( WebDriver x) {
		driver =x;
	}

	public WebElement getApplyNow() {
		WebElement ApplyNow = driver.findElement(By.linkText("Apply Now"));
		return ApplyNow;
	}
	
	public WebElement getGetStartedNow() {
		WebElement GetStartedNow = driver.findElement(By.linkText("Get Started Now!"));
		return GetStartedNow;
	}
	
	public WebElement getFirstName() {
		WebElement FirstName = driver.findElement(By.name("first_name"));
		return FirstName;
	}
	
	public WebElement getLastName() {
		WebElement LastName = driver.findElement(By.name("last_name"));
		return LastName;
	}
	
	public WebElement getEmail() {
		WebElement Email = driver.findElement(By.name("email"));
		return Email;
	}
	public WebElement getConfirmEmail() {
		WebElement ConfirmEmail = driver.findElement(By.name("email_confirmation"));
		return ConfirmEmail;
	}
	
	public WebElement getBestContactNumber() {
		WebElement BestContactNumber = driver.findElement(By.name("best_contact_number"));
		return BestContactNumber;
	}
	
	public WebElement getPassword() {
		WebElement Password = driver.findElement(By.name("password"));
		return Password;
	}
	
	public WebElement getPasswordConfirmation() {
		WebElement PasswordConfirmation = driver.findElement(By.name("password_confirmation"));
		return PasswordConfirmation;
	}
	
	
	
	

}

