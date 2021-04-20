package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	ContactPage contactPage;
	@FindBy(className="user-display")
	WebElement userLogged;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isUserLoggedIn() {
		return userLogged.isDisplayed();
	}
	public ContactPage navigatetocontactPage() {
		contactLink.click();
		return new ContactPage();
	}
}
