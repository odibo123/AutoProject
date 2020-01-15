package stepDefinitionTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
    
	HomePage homePage= new HomePage();
	RegisterPage registerPage = new RegisterPage ();



/*@Given("^I log into create an account Page$")
public void i_log_into_create_an_account_Page() throws Throwable {
	HomePage homePage =PageFactory.initElements(driver, HomePage .class);
	homePage.I_click_signInLink();
}*/

@When("^I attempt to create  a personal  account by entering  \"([^\"]*)\" that is already in use$")
public void i_attempt_to_create_a_personal_account_by_entering_that_is_already_in_use(String emailid) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage .enter_emailid(emailid); 
	registerPage .click_create_an_account_Btn();
}
@Then("^error message should be displayed$")
public void error_message_should_be_displayed() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
String errorMessage=	registerPage.verify_Error_Message();
System.out.println(errorMessage);
}

@Given("^I log into create  account page using email that is not in use$")
public void i_log_into_create_account_page_using_email_that_is_not_in_use() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.i_type_email_not_in_use();
	registerPage .click_create_an_account_Btn();
}

/*@Given("^I log into create  account page using email that is not in use$")
public void i_log_into_create_account_page_using_email_that_is_not_in_use() throws Throwable {
   
}*/

@When("^I fills in personal information by choosing title and  entering \"([^\"]*)\" and \"([^\"]*)\" email and \"([^\"]*)\" and date of birth$")
public void i_fills_in_personal_information_by_choosing_title_and_entering_and_email_and_and_date_of_birth(String firstname, String  lastname, String myPassword) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	Thread.sleep(5000);
	registerPage.click_radio_button();
	Thread.sleep(3000);
	registerPage.type_firstname(firstname);
	
	
	registerPage.type_lastname(lastname);
	driver.manage().deleteAllCookies();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,250)", "");
	 Thread.sleep(3000);
	 driver.manage().deleteAllCookies();
	registerPage.type_password(myPassword);
	registerPage.selectMydateOfBirth();
	registerPage.selectMonthOfBirth();
	registerPage.selectYearOfBirth();
	
	
}

@When("^I fills in address section by filling \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_fills_in_address_section_by_filling_and_and_and_and(String company, String addressLine1, String addressLine2, String city, String zipcode) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class); 
	//registerPage.type_company_name(company);
	registerPage .type_Line_1_Address(addressLine1);
	registerPage .type_Line_2_Address(addressLine2);
	registerPage .type_city_name(city);
	//registerPage .selectStateDropDown();
	registerPage.type_zipcode_name(zipcode);
}

@When("^I also chooses state and country$")
public void i_also_chooses_state_and_country() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage .selectStateDropDown();
	registerPage.selectCountryDropDown();
}
@Then("^I types additional information by entering \"([^\"]*)\" and \"([^\"]*)\" email and \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_types_additional_information_by_entering_and_email_and_and(String Messages, String HomePhone, String Mobilephone, String AssignedAddress) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.type_into_MesssageInputBtn(Messages);
	registerPage.type_into_HomephoneBtn(HomePhone);
	registerPage.type_into_MobilePhoneBtn(Mobilephone);
	registerPage.clear_Address_box();
	registerPage.type_into_MyaddressBtn(AssignedAddress);
	//registerPage.type_into_MyaddressBtn(AssignedAddress);
}

@Then("^I log into personal account Page$")
public void i_log_into_personal_account_Page() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.click_register_button();
}
@Then("^I confirms account was registered successfully$")
public void i_confirms_account_was_registered_successfully() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	String registeredUserName=registerPage.confirm_registered_name();
	System.out.println("The name of the registered user is "+registeredUserName);
	//Assert.assertEquals(expected, actual);
	//Assert.assertEquals(expectedInvalidpasswordErrMessage,loginPage.verify_Invalid_passwordErrorMessage());
	Assert.assertEquals(registeredUserName,registerPage.confirm_registered_name());

}


}
