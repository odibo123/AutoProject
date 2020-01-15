package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import pages.AddressPage;
import pages.RegisterPage;

public class MyAddressTest extends TestBase{
	RegisterPage registerPage = new RegisterPage(); 
	AddressPage addressPage = new AddressPage();
	@Then("^I choose use the delivery address as my billing address$")
	public void i_choose_use_the_delivery_address_as_my_billing_address() throws Throwable {
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage .class);
		 addressPage .select_addressDropdown();
	}

	@Then("^I attempt to add a new address$")
	public void i_attempt_to_add_a_new_address() throws Throwable {
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage .class);
		addressPage.click_DeliveryAddressBtn();
		//addressPage.click_AddNewAddressArrow();
	}
	@Then("^I fills in new address by filling \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" along with state and country$")
	public void i_fills_in_new_address_by_filling_and_and_and_and_along_with_state_and_country(String Company, String AddressLine1, String AddressLine2, String City, String Zipcode) throws Throwable {
		RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
		 registerPage.type_newcompany_name(Company);
		registerPage.type_newLine_1_Address(AddressLine1);
		 registerPage.type_newLine_2_Address(AddressLine2);
		 registerPage.type_newcity_name(City);
		 registerPage.typenew_zipcode_name(Zipcode);
		 registerPage.selectnewStateDropDown();
		 registerPage.selectnewCountryDropDown();
		
			
	}
	@Then("^I log into billing page showing my new address$")
	public void i_log_into_billing_page_showing_my_new_address() throws Throwable {
		AddressPage addressPage = PageFactory.initElements(driver, AddressPage .class); 
		addressPage.click_SavedBtn();
	}
}
