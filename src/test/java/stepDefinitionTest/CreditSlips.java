package stepDefinitionTest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyAccountPage;

public class CreditSlips extends TestBase{
	
	 MyAccountPage  myAccountPage= new  MyAccountPage();
	@When("^I click on My credit slips$")
	public void i_click_on_My_credit_slips() throws Throwable {
		MyAccountPage  myAccountPage = PageFactory.initElements(driver, MyAccountPage .class);
		myAccountPage .click_CreditSlipsField();
	}

	@Then("^I should see my credit slips$")
	public void i_should_see_my_credit_slips() throws Throwable {
		MyAccountPage  myAccountPage = PageFactory.initElements(driver, MyAccountPage .class);
	String message=	myAccountPage .confirm_CreditCardMessage();
	System.out.println(message);
	Assert.assertEquals(message,myAccountPage.confirm_CreditCardMessage());
	}

}
