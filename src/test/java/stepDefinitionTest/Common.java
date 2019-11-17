package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import cucumber.api.java.en.Then;


public class Common extends TestBase{
	
	HomePage homePage = new HomePage();
	
	@Given("^I am  on the Home Page$")
	public void i_am_on_the_Home_Page() throws Throwable {
	    TestBase.initialization();
	}
	@Given("^I see a logo banner$")
	public void i_see_a_logo_banner() throws Throwable {
		 
		HomePage homePage =PageFactory.initElements(driver, HomePage .class);
	boolean b =	homePage.I_verify_LogoLabel();
	    System.out.println("Logo banner is displayed is "+ b);
	}
	@When("^I click sign in$")
	public void i_click_sign_in() throws Throwable {
		HomePage homePage =PageFactory.initElements(driver, HomePage .class);
		homePage.I_click_signInLink();
	}

}
