package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import pages.MyAccountPage;

public class SignOutTest extends TestBase {
	MyAccountPage myAccountPage = new MyAccountPage();
	@Then("^I log out$")
	public void i_log_out() throws Throwable {
		MyAccountPage  myAccountPage = PageFactory.initElements(driver, MyAccountPage .class);
		myAccountPage.click_SignOutLink();
	}

}
