package stepDefs;
// we have to import all from io.cucumber

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDev extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
@Given("User is already on login page")
public void user_is_already_on_login_page() {
	initialize();
   LoginPage loginPage= new LoginPage();
   
}
//777
@When("User enter login credentials")		
public void user_enter_login_credentials(DataTable users) {
	List<Map<String, String>> data = users.asMaps();
	String username = data.get(0).get("username");
	String password= data.get(0).get("password");
	loginPage.login(username, password);
}


@Then("User is on Home page")
public void user_is_on_Home_page() {
	
	homePage = new HomePage();
	boolean userDisplay= homePage.isUserLoggedIn();
	Assert.assertTrue(userDisplay);
}

@Then("Close browser")
public void close_browser() {
    driver.close();
}
}
