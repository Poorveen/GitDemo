package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class Stepdefination extends base {

    @Given("^Initialize browser with chrom$")
    public void initialize_browser_with_chrom() throws Throwable 
    {
    	driver = initializerDriver(driver);
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and log in$")
    public void user_enter_something_and_something_and_log_in(String strArg1, String strArg2) throws Throwable
    {
    	LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(strArg1);
		lp.password().sendKeys(strArg2);
		lp.login().click();
    }

    @Then("^Verify that user login successfully logged in $")
    public void verify_that_user_login_successfully_logged_in() throws Throwable 
    {
        System.out.println("User get log in successfully");
    }

    @And("^Naviagte to \"([^\"]*)\" site$")
    public void naviagte_to_something_site(String strArg1) throws Throwable 
    {
    	driver.get( strArg1);
    }

    @And("^Click on Login link in home page to land on secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable
    {
    	LandingPage l = new LandingPage(driver);
		l.getLogin().click();
    }
}
