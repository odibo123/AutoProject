package stepDefinitionTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AddressPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.ProductPage;
import pages.ProductsListingPage;
import pages.ShippingPage;

public class EndToEndTest extends TestBase{
	ProductPage  productPage  = new ProductPage ();
	//ProductsListingPage deleteSameItemProductListingPage= new ProductsListingPage();
	ProductsListingPage productsListingPage = new ProductsListingPage();
	AddressPage addressPage = new AddressPage();
	ShippingPage shippingPage = new ShippingPage();
	PaymentPage paymentPage = new PaymentPage();
	HomePage homePage = new HomePage();
	@Then("^I log in into sign in page$")
	public void i_log_in_into_sign_in_page() throws Throwable {
		ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);
		productsListingPage.I_click_on_ProceedToCheckoutButton();	 
	}
	@Then("^I confirm seeing correct address details$")
	public void i_confirm_seeing_correct_address_details() throws Throwable {
		AddressPage addressPage= PageFactory.initElements(driver, AddressPage .class); 
	String myAddress=addressPage.i_verify_DeliveryOrBillingAddress();
	System.out.println("my contact address is  "+myAddress);
	//Assert.assertEquals(myAddress, addressPage.i_verify_DeliveryOrBillingAddress());
	}

	@Then("^I log into shipping page$")
	public void i_log_into_shipping_page() throws Throwable {
		AddressPage addressPage= PageFactory.initElements(driver, AddressPage .class); 
		addressPage.click_AddressProccedToCheckoutBox();
	}

	@Then("^I log into payment Page after agreeing on terms of service$")
	public void i_log_into_payment_Page_after_agreeing_on_terms_of_service() throws Throwable {
		ShippingPage shippingPage= PageFactory.initElements(driver, ShippingPage .class);
		shippingPage.Tick_TermsOfServiceBox();
		shippingPage.click_ShippingProccedToCheckoutBox();
	}

	@Then("^i chooose my payment method$")
	public void i_chooose_my_payment_method() throws Throwable {
		PaymentPage paymentPage= PageFactory.initElements(driver, PaymentPage.class);
	String paymentPageTitle =	paymentPage.verify_Payment_Page_Title();
	Assert.assertEquals(paymentPageTitle, paymentPage.verify_Payment_Page_Title());
	System.out.println("The title of payment page Title is "+paymentPageTitle);
	String verifyPaymentChoiceText= paymentPage.verify_PleaseChooseYourPaymentText();
	System.out.println(verifyPaymentChoiceText);
	paymentPage.click_PayByBankWireInputArrow();
	
	}

	@When("^i confirm my order$")
	public void i_confirm_my_order() throws Throwable {
		PaymentPage paymentPage= PageFactory.initElements(driver, PaymentPage.class);
		paymentPage.click_I_confirm_my_orderText();
	}

	@Then("^I should see a message coinfirming the order placed$")
	public void i_should_see_a_message_coinfirming_the_order_placed() throws Throwable {
		PaymentPage paymentPage= PageFactory.initElements(driver, PaymentPage.class);
		String myOrderDetails=paymentPage.verify_OrderDetailsBox();
		System.out.println(myOrderDetails);
	    
	}
	@Given("^user mouses hover women  and clicks on summer dress$")
	public void user_mouses_hover_women_and_clicks_on_summer_dress() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver,HomePage.class);
		homePage.click_SummerDressLabel();
	}

	@Given("^user changes the price range from \\$(\\d+) to \\$(\\d+)$")
	public void user_changes_the_price_range_from_$_to_$(int arg1, int arg2) throws Throwable {
		ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);
		//Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,750)", "");
		HomePage  homePage = PageFactory.initElements(driver, HomePage .class);
	//	Thread.sleep(5000);
		 productsListingPage.change_further_price_range();
	}
	@When("^user chooses specific size,colour,styles,composition properties,availability manufacture, condition and price range$")
	public void user_chooses_specific_size_colour_styles_composition_properties_availability_manufacture_condition_and_price_range() throws Throwable {
		ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);  
		productsListingPage.click_SizeBtn();
		productsListingPage.click_ColourBtn();
		productsListingPage.click_CompositionBtn();
		productsListingPage.click_StylesBtn();
		productsListingPage.click_PropertyBtn();
		productsListingPage.click_AvailabilityBtn();
		productsListingPage.click_ConditionBtn();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,250)", "");
		productsListingPage.change_further_price_range();
	}
	@Then("^user logs into a page showing chosen item boldly displayed$")
	public void user_logs_into_a_page_showing_chosen_item_boldly_displayed() throws Throwable {
		ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);
		productsListingPage.click_ChosenItemBtn();   
	}
	
	@Then("^user click on Add To Cart button$")
	public void user_click_on_Add_To_Cart_button() throws Throwable {
		//ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);
		//Thread.sleep(5000);
		//productsListingPage.I_click__ONAdd2CartButtotn();
		ProductPage productPage = PageFactory.initElements(driver,ProductPage.class);
		productPage .click_Add_To_Cart_Button();
	}
	@Then("^user logs in and sees product successfully added to shopping cart$")
	public void user_logs_in_and_sees_product_successfully_added_to_shopping_cart() throws Throwable {
		//ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage.class);
		//productsListingPage.I_click__ONAdd2CartButtotn();
		ProductPage productPage = PageFactory.initElements(driver,ProductPage.class);
		Thread.sleep(5000);
		productPage.click_Add_To_Cart_Button();
		
		
		
		
	    
	}

}
