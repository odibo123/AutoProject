package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ProductsListingPage;
import pages.ShoppingCartSummaryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends TestBase{
	
	HomePage homePage = new HomePage();
	LoginPage loginPage  = new LoginPage ();
	ProductPage  productPage  = new ProductPage ();
	ProductsListingPage productsListingPage= new ProductsListingPage();
	ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();
@Given("^I log into search page by entering desired \"([^\"]*)\"$")
public void i_log_into_search_page_by_entering_desired(String clothing) throws Throwable {
	HomePage homePage = PageFactory.initElements(driver, HomePage .class);
	 homePage .click_on_Search_Text_Box();
	 homePage.type_Choice_of_clothes(clothing);
	 homePage.I_click_Search_Icon_Box();	 
}
@Then("^I chooses an item displaying image and title and price$")
public void i_chooses_an_item_displaying_image_and_title_and_price() throws Throwable {
	ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage .class);
	String productPrice=productsListingPage.verify_Product_Price();
	System.out.println("The Price is " +productPrice);
	Assert.assertEquals(productPrice,productsListingPage.verify_Product_Price());
	Boolean canSeeTheDress=productsListingPage.I_Verify_ProductQuickview_Image();
	System.out.println("User can see the dress is "+canSeeTheDress);
	Assert.assertTrue(productsListingPage.I_Verify_ProductQuickview_Image());
	 String title=	productsListingPage.verify_Product_Title();
	 System.out.println("The title of the page is "+ title);
	 Assert.assertEquals(title, productsListingPage.verify_Product_Title());
}
@Then("^I logs into page showing product boldly displayed$")
public void i_logs_into_page_showing_product_boldly_displayed() throws Throwable {
	ProductsListingPage productsListingPage = PageFactory.initElements(driver, ProductsListingPage.class);
	productsListingPage.click_ProductQuickview_Item();
	String myProductTitle= productsListingPage.validate_myProduct_Title();
	 System.out.println("The title of product listing page is "+myProductTitle);
}

@Then("^I confirm details of product to be purchased$")
public void i_confirm_details_of_product_to_be_purchased() throws Throwable {
	ProductPage  productPage  = PageFactory.initElements(driver, ProductPage.class); 
	boolean flag=	productPage.I_see_big_picture_of_itemPurchased();
	Assert.assertTrue(flag);
	boolean d=productPage .I_confirm_the_Price();
	System.out.println("User see the bolder text of the price of my item "+d);
	String e=productPage.I_see_bolder_item_text();
	System.out.println("The text of the item boldly displayed is  "+e);
}

@Then("^I click on Add To Cart button$")
public void i_click_on_Add_To_Cart_button() throws Throwable {
	ProductPage  productPage  = PageFactory.initElements(driver, ProductPage.class); 
	productPage .click_Add_To_Cart_Button();
	
}

@Then("^I confirm seeing a message saying product is successfully added to cart$")
public void i_confirm_seeing_a_message_saying_product_is_successfully_added_to_cart() throws Throwable {
	ProductPage  productPage  = PageFactory.initElements(driver, ProductPage.class); 
	String confirmedMessage= productPage.I_verify_message_product_addedTo_shopping_Cart();
	System.out.println("The message displayed is "+ ""+confirmedMessage);
	Assert.assertEquals(confirmedMessage,productPage.I_verify_message_product_addedTo_shopping_Cart());
}

@Then("^I log into shopping cart summary page$")
public void i_log_into_shopping_cart_summary_page() throws Throwable {
	ProductPage  productPage  = PageFactory.initElements(driver, ProductPage.class); 
	productPage.click_ProccedToCheckout_Button();
}

@Then("^I clicks on the negative button under the quantity section$")
public void i_clicks_on_the_negative_button_under_the_quantity_section() throws Throwable {
	ShoppingCartSummaryPage shoppingCartSummaryPage =  PageFactory.initElements(driver, ShoppingCartSummaryPage.class); 
	shoppingCartSummaryPage.click_QtyNegativeBtn();
}
@Then("^I chooses one item displaying image and title and price$")
public void i_chooses_one_item_displaying_image_and_title_and_price() throws Throwable {
	ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage .class);
	String productPrice=productsListingPage.verify_Product_Price();
	System.out.println("The Price is " +productPrice);
	Assert.assertEquals(productPrice,productsListingPage.verify_Product_Price());
	Boolean canSeeTheDress=productsListingPage.I_Verify_ProductQuickview_Image();
	System.out.println("User can see the dress is "+canSeeTheDress);
	Assert.assertTrue(productsListingPage.I_Verify_ProductQuickview_Image());
	 String title=	productsListingPage.verify_Product_Title();
	 System.out.println("The title of the page is "+ title);
	 Assert.assertEquals(title, productsListingPage.verify_Product_Title());
	
}

@Then("^I confirm seeing exact quantity added to cart$")
public void i_confirm_seeing_exact_quantity_added_to_cart() throws Throwable {
	//ProductsListingPage productsListingPage= PageFactory.initElements(driver, ProductsListingPage .class);
	//String exactQuantityAdded=productsListingPage.validate_QuantityAddedToCartTxt();
	//System.out.println(exactQuantityAdded);
	ProductPage  productPage  = PageFactory.initElements(driver, ProductPage.class); 
	String exactQuantityAdded= productPage.validate_QuantityAddedToCartTxt();
	System.out.println(exactQuantityAdded);
	Assert.assertEquals("There is 1 item in your cart.",exactQuantityAdded);	
}

@Then("^I  validate the message shopping cart is empty$")
public void i_validate_the_message_shopping_cart_is_empty() throws Throwable {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage .class);
	String emptyCartMessage=loginPage.validate_ShoppingCartEmptyMessage();
	System.out.println(emptyCartMessage);  
}
}
