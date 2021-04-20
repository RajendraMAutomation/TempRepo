package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactPage extends TestBase{

	@FindBy(name="")
	WebElement createBtn;
	
	@FindBy(name="")
	WebElement firstName;
	
	@FindBy(name="")
	WebElement lastName;
	
	@FindBy(name="")
	WebElement saveBtn;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public void createContact(String fName, String lName) {
		createBtn.click();
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		saveBtn.click();
	}
	
	
}
