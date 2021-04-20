package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactPage;
import pages.HomePage;

public class ContactStepDef {
HomePage homePage;
ContactPage contactPage;
	
	@Given("User is on Contact Page")
	public void user_is_on_Contact_Page() {
		homePage = new HomePage();
		homePage.navigatetocontactPage();
	}

	@Then("Enter Contact Deatils")
	public void enter_Contact_Deatils() {
	    contactPage = new ContactPage();
	    contactPage.createContact("Taining", "theUser2");
	}

	@Then("New Contact is created")
	public void new_Contact_is_created() {
	    
	}
}
