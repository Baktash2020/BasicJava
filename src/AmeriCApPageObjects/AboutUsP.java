package AmeriCApPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsP {
	
	
    WebDriver driver;
	
	public AboutUsP( WebDriver x) {
		driver =x;
	}

	public WebElement getFirstName() {
		WebElement FirstName = driver.findElement(By.id("first_name"));
		return FirstName;
	}
	
	public WebElement getLastName() {
		WebElement LastName = driver.findElement(By.id("last_name"));
		return LastName;
	}
	
	public WebElement getEmail() {
		WebElement Email = driver.findElement(By.id("email"));
		return Email;
	}
	
	public WebElement getHomePhone() {
		WebElement Phone = driver.findElement(By.id("home_phone"));
		return Phone;
	}
	
	public WebElement getLoanAmount() {
		WebElement LoanAmount = driver.findElement(By.id("loan_amount"));
		return LoanAmount;
	}
	
	public WebElement getPropertyValue() {
		WebElement PropertyValue = driver.findElement(By.id("property_value"));
		return PropertyValue;
	}
	
	public WebElement getLoanType() {
		WebElement LoanType = driver.findElement(By.id("loan_type"));
		return LoanType;
	}
	
	public WebElement getCreditHistory() {
		WebElement CreditHistory = driver.findElement(By.id("credit_history"));
		return CreditHistory;
	}
	
	
}
