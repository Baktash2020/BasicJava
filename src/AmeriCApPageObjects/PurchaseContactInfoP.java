package AmeriCApPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseContactInfoP {
	
WebDriver driver;
	
	public PurchaseContactInfoP( WebDriver x) {
		driver =x;
	}
    
	public WebElement getHomePurchase() {
		WebElement HomePurchase= driver.findElement(By.linkText("Home Purchase"));
		return HomePurchase;
	}
	
	public WebElement getContinue() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	
	public WebElement getSingleFamily() {
		WebElement SingleFamily= driver.findElement(By.linkText("Single Family"));
		return SingleFamily;
	}
	
	public WebElement getPrimaryResidence() {
		WebElement PrimaryResidence= driver.findElement(By.linkText("Primary Residence"));
		return PrimaryResidence;
	}
	
	public WebElement getExcellent() {
		WebElement Excellent= driver.findElement(By.linkText("Excellent"));
		return Excellent;
	}
	
	public WebElement getAlreadyFoundHome() {
		WebElement AlreadyFoundHome= driver.findElement(By.name("SpecificHome"));
		return AlreadyFoundHome;
	}
	
	//public WebElement getContinue1() {
		//WebElement Continue= driver.findElement(By.linkText("Continue"));
		//return Continue;
	//}
	
	public WebElement getSelectPurchasePrice() {
		WebElement SelectPurchasePrice= driver.findElement(By.name("PropertyValue"));
		return SelectPurchasePrice;
	}
	
	public WebElement getContinue2() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	public WebElement getDownPayment() {
		WebElement DownPayment= driver.findElement(By.xpath("//*[/div[3]/div[1]/img"));
		return DownPayment;
	}
	
	//public WebElement getContinue1() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		//return Continue;
	//}
	
	public WebElement getContinue4() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	
	public WebElement getContinue5() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	
	public WebElement getContinue6() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	
	public WebElement getContinue1() {
		WebElement Continue= driver.findElement(By.linkText("Continue"));
		return Continue;
	}
	
	
	
	public WebElement getBestTimeContact() {
		WebElement BestTimeContact = driver.findElement(By.name("ContactTime"));
		return BestTimeContact;
	}

	public WebElement getFirstName() {
		WebElement FirstName = driver.findElement(By.name("FirstName"));
		return FirstName;
	}
	public WebElement getLastName() {
		WebElement LastName = driver.findElement(By.name("LastName"));
		return LastName;
	}
	
	public WebElement getEmail() {
		WebElement EmailAddress = driver.findElement(By.name("EmailAddress"));
		return EmailAddress;
	}
	
	public WebElement getHomePhone() {
		WebElement HomePhone = driver.findElement(By.name("HomePhone"));
		return HomePhone;
	}
	
	public WebElement getAltPhone() {
		WebElement AltPhone = driver.findElement(By.name("WorkPhone"));
		return AltPhone;
	}
	
	
	
	
}
