package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.MyAccountPage;

public class MyPersonalInformationTest extends TestBase{
	MyAccountPage myAccountPage = new MyAccountPage();
	
	@When("^I click on My Personal Information text field$")
	public void i_click_on_My_Personal_Information_text_field() throws Throwable {
		MyAccountPage myAccountPage= PageFactory.initElements(driver, MyAccountPage.class);
		myAccountPage.click_MyPersonalInformationField();
	}

	@Then("^I should be on personal information page$")
	public void i_should_be_on_personal_information_page() throws Throwable {
		MyAccountPage myAccountPage= PageFactory.initElements(driver, MyAccountPage.class);
	String PersonalInformationMessage=	myAccountPage.validate_MyPersonalInformationMessage();
	System.out.println("Personal iformation message is "+PersonalInformationMessage);
	Assert.assertEquals("Please be sure to update your personal information if it has changed.",PersonalInformationMessage);
		
	}
	

}
