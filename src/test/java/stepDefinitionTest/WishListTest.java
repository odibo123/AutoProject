package stepDefinitionTest;

import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.WishListPage;

public class WishListTest extends TestBase{
	HomePage homePage = new HomePage();
	WishListPage wishListPage= new WishListPage();
@Then("^I log  into sign in page$")
public void i_log_into_sign_in_page() throws Throwable {
	HomePage homePage= PageFactory.initElements(driver, HomePage.class);
	homePage.I_click_signInLink();
}
@When("^I click on My wishlist$")
public void i_click_on_My_wishlist() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_WishListTextField();
}

@Then("^I should see my wishlist$")
public void i_should_see_my_wishlist() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
String myWishList=	wishListPage.I_should_see_myWishlist();
System.out.println("I see different products under "+myWishList);
Assert.assertEquals( myWishList,wishListPage.I_should_see_myWishlist());
}
@When("^I type my desired Clothing on \"([^\"]*)\" message box$")
public void i_type_my_desired_Clothing_on_message_box(String newWishlist) throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.I_type_on_nameOfNewWishListField(newWishlist);
}

@When("^l click on save button$")
public void l_click_on_save_button() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class); 
	wishListPage.click_WishListSaved_Btn();
}

@Then("^I should confirm that the desired item was saved$")
public void i_should_confirm_that_the_desired_item_was_saved() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class); 
	String mySavedItem=wishListPage.I_should_see_myWishlistSavedItem();
	
	System.out.println("My saved item is "+mySavedItem);
}
@Then("^I click on my wishlist image saved item$")
public void i_click_on_my_wishlist_image_saved_item() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	
	wishListPage.click_SavedItemImage();
	
}

@When("^I add it to my wishlist$")
public void i_add_it_to_my_wishlist() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_AddToWishListLink();
}

@Then("^I should see a confirmation message saying it is added to my wishlist$")
public void i_should_see_a_confirmation_message_saying_it_is_added_to_my_wishlist() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	String messageConFirmatn=wishListPage.confirm_seeing_wishlist_is_added();
	System.out.println("The message seen is "+messageConFirmatn);
	Assert.assertEquals(messageConFirmatn, wishListPage.confirm_seeing_wishlist_is_added());
}
@When("^I click on delete button$")
public void i_click_on_delete_button() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_Delete_Icon();

}
@Then("^I should be able to delete my wishList item$")
public void i_should_be_able_to_delete_my_wishList_item() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_ok_to_delete_alert(); 
}
/*@Then("^I should see a message requesting if I really want to delete an item$")
public void i_should_see_a_message_requesting_if_I_really_want_to_delete_an_item() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
	wishListPage.click_ok_to_delete_alert();
}
*/
@Then("^I should confirm that my wishlist is deleted after honouring the request$")
public void i_should_confirm_that_my_wishlist_is_deleted_after_honouring_the_request() throws Throwable {
	WishListPage wishListPage= PageFactory.initElements(driver,WishListPage.class);
}
}
