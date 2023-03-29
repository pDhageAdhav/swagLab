package cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	
	loginPage lp = new loginPage();
	
	@Given("^I am the user of facebook application$")
	public void i_am_the_user_of_facebook_application() throws Throwable {
	  
	    lp.openURL();
	}

	@When("^I enter valid userName$")
	public void i_enter_valid_userName() throws Throwable {
	    lp.enterUserID();
	    throw new PendingException();
	}

	@When("^I enter valid Password$")
	public void i_enter_valid_Password() throws Throwable {
	    lp.enterPassword();
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
	   lp.clickLoginButton(); 
	}

	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() throws Throwable {
	   lp.verifyLogin();
	}
}		
