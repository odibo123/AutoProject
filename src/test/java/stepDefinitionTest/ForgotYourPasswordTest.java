package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ContactUsPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;

public class ForgotYourPasswordTest extends TestBase{
	LoginPage loginPage = new LoginPage();
	ContactUsPage  contactUsPage  = new ContactUsPage ();
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

@When("^I click forgot password link$")
public void i_click_forgot_password_link() throws Throwable {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.click_ForgotYourPasswordLink();
}

@Then("^I should see a message requesting I enter email I registered with$")
public void i_should_see_a_message_requesting_I_enter_email_I_registered_with() throws Throwable {
	ForgotPasswordPage forgotPasswordPage= PageFactory.initElements(driver, ForgotPasswordPage.class);
	String passwordMessageRequest=forgotPasswordPage.validate_PasswordRequestMessage();
	System.out.println(passwordMessageRequest);
	Assert.assertEquals("Please enter the email address you used to register. We will then send you a new password.", passwordMessageRequest);
}

@When("^I enter my email address$")
public void i_enter_my_email_address() throws Throwable {
	ContactUsPage  contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
	contactUsPage .type_my_email();
}
@Then("^I enter correct  \"([^\"]*)\"$")
public void i_enter_correct(String emailAddress) throws Throwable {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.enter_email(emailAddress);
}
@When("^I attempt to retrieve my password$")
public void i_attempt_to_retrieve_my_password() throws Throwable {
	ForgotPasswordPage forgotPasswordPage= PageFactory.initElements(driver, ForgotPasswordPage.class);
	forgotPasswordPage.click_RetrievePasswordBtn();
}

@Then("^I should see a confirmation message sent  to my address$")
public void i_should_see_a_confirmation_message_sent_to_my_address() throws Throwable {
	ForgotPasswordPage forgotPasswordPage= PageFactory.initElements(driver, ForgotPasswordPage.class);
	String passwordConfirmedMessage=forgotPasswordPage.validate_PasswordSentConfirmationMessge();
	System.out.println(passwordConfirmedMessage);
	Assert.assertEquals(passwordConfirmedMessage,forgotPasswordPage.validate_PasswordSentConfirmationMessge());
}
}
