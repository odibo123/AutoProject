package stepDefinitionTest;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchTest extends TestBase{
	

@Given("^I search for \"([^\"]*)\" in the search input box$")
public void i_search_for_in_the_search_input_box(String arg1) throws Throwable {
  
}

@Given("^I see search product listing page$")
public void i_see_search_product_listing_page() throws Throwable {
   
}

@When("^I click on the first item on page$")
public void i_click_on_the_first_item_on_page() throws Throwable {
   
}

@Then("^I verify search description \"([^\"]*)\" on the product page$")
public void i_verify_search_description_on_the_product_page(String arg1) throws Throwable {
    
}

@Then("^I also see option to select sizes$")
public void i_also_see_option_to_select_sizes() throws Throwable {
    ;
}

@Then("^I validate  the item is in stock$")
public void i_validate_the_item_is_in_stock() throws Throwable {
    ;
}

}
