package stepDefinitionTest;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginStep extends TestBase{
	
	LoginPage loginPage = new LoginPage();
	
	 MyAccountPage   myAccountPage = new  MyAccountPage (); 
	 
/* @Before
		public void setUp() throws IOException{
		initialization();
		}*/
	@When("^I login in with correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_in_with_correct_and(String email, String password) throws Throwable {
	  
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage .enter_email(email);
			loginPage .enter_password(password);
			 myAccountPage = 	loginPage .click_SignInBtn();
		//int j = loginPage.find_size();
		//System.out.println("number of email boxes are "+j);
	}
/*	@Then("^I should see \"([^\"]*)\" on the dashboard$")
	public void i_should_see_on_the_dashboard(String  myName) throws Throwable {
		 MyAccountPage   myAccountPage =  PageFactory.initElements(driver,MyAccountPage .class);
	    String expectedName= myAccountPage.validate_logged_in_username();
	    System.out.println("The name on the dashboard is "+expectedName);
	//	Assert.assertEquals(expectedName, myAccountPage.validate_logged_in_username());
		
	}*/
	@Then("^I should see \"([^\"]*)\" on the dashboard that I logged in successfully$")
	public void i_should_see_on_the_dashboard_that_I_logged_in_successfully(String arg1) throws Throwable {
		 MyAccountPage   myAccountPage =  PageFactory.initElements(driver,MyAccountPage .class);
		    String expectedName= myAccountPage.validate_logged_in_username();
		    System.out.println("The name on the dashboard is "+expectedName);
	}
	@When("^I try to log in with incorrect  \"([^\"]*)\" or incorrect \"([^\"]*)\"$")
	public void i_try_to_log_in_with_incorrect_or_incorrect(String email, String passwd) throws Throwable {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enter_incorrect_emailAddress(email);
		loginPage.enter_incorrect_password(passwd);
		loginPage.click_SignInBtn();
		
	}

	@Then("^I should see error \"([^\"]*)\"$")
	public void i_should_see_error(String message) throws Throwable {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	String expectedAuthenticatnErrMessgage=	loginPage.verify_authentication_failedErrorMessage();
	System.out.println("Error Message displayed is "+expectedAuthenticatnErrMessgage);
	Assert.assertEquals(expectedAuthenticatnErrMessgage, loginPage.verify_authentication_failedErrorMessage());
	
	String expectedInvalidpasswordErrMessage=loginPage.verify_Invalid_passwordErrorMessage();
	System.out.println(expectedInvalidpasswordErrMessage);
	//Assert.assertEquals(expectedInvalidpasswordErrMessage,loginPage.verify_Invalid_passwordErrorMessage());
	}
	@When("^I try to log in with blank  \"([^\"]*)\" or \"([^\"]*)\"$")
	public void i_try_to_log_in_with_blank_or(String MyemailAddress, String Mypasssword) throws Throwable {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage .enter_blank_emailAddress(MyemailAddress);
		loginPage .enter_blank_passsword(Mypasssword);
		loginPage .click_SignInBtn();
	}
	@Then("^I validate  \"([^\"]*)\"$")
	public void i_validate(String errorMesssage) throws Throwable {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	String expectedEmailErrorMessage=loginPage .verify_EmailErrorMessage();
	System.out.println(expectedEmailErrorMessage);
	Assert.assertEquals(expectedEmailErrorMessage, loginPage .verify_EmailErrorMessage());
	}
}
