package stepDefinitionTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;
import cucumber.api.java.en.Then;


public class Common extends TestBase{
	
	HomePage homePage = new HomePage();
/*@Before
	public void setUp() throws IOException{
	initialization();
	}*/
	@Given("^I am  on the Home Page$")
	public void i_am_on_the_Home_Page() throws Throwable {
	    TestBase.initialization();
	/* List<WebElement> link=   driver.findElements(By.tagName("a"));
	 //System.out.println(link.size());
	 for(WebElement myLink:link){
		 System.out.println(myLink.getText());
	 }*/
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
	/*@Given("^I log into create account Page$")
	public void i_log_into_create_account_Page() throws Throwable {
		HomePage homePage =PageFactory.initElements(driver, HomePage .class);
		homePage.I_click_signInLink();
	}*/

}
