package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class WishListPage extends TestBase{
	
	

	@FindBy(how=How.CSS, using= "#center_column > div > div:nth-child(2) > ul > li > a > span")
	WebElement WishListTextField;
	

	@FindBy(how=How.CSS, using= "#mywishlist > h1")
	WebElement MyWishListHeader;
	
	@FindBy(how=How.CSS, using= "#submitWishlist > span")
	WebElement SavedWishListBtn;
	
	@FindBy(how=How.CSS, using= "#name")
	WebElement nameOfNewWishListField;
	
	@FindBy(how=How.XPATH, using= "//a[contains(text(),'blouse')]")
	WebElement ConFirmedNewWishlistItem;
	
	@FindBy(how=How.CSS, using= "#wishlist_button")
	WebElement AddToWishListLink;
	
	@FindBy(how=How.CSS, using= "#best-sellers_block_right > div > ul > li:nth-child(3) > a > img")
	WebElement SavedItemImage;
	
	@FindBy(how=How.CSS, using= "#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div > div > p")
	WebElement AddedWishListConfirmationMessage;
	
	@FindBy(how=How.XPATH, using= "//i[@class='icon-remove']")
	WebElement DeleteIcon;
	
	public void click_WishListTextField(){
		WishListTextField.click();	
	}
	
	public String I_should_see_myWishlist(){
	return	MyWishListHeader.getText();	
	}
	
	public void I_type_on_nameOfNewWishListField(String newWishlist){
		nameOfNewWishListField.sendKeys(newWishlist);
	}
	public void click_WishListSaved_Btn(){
		SavedWishListBtn.click();
	}
	public String I_should_see_myWishlistSavedItem(){
		return ConFirmedNewWishlistItem.getText();
		}
	public void click_SavedItemImage(){
		 SavedItemImage.click();
	}
	public void click_AddToWishListLink(){
		AddToWishListLink.click();
	}
public String confirm_seeing_wishlist_is_added(){
	return AddedWishListConfirmationMessage.getText();
}
public void click_Delete_Icon(){
	DeleteIcon.click();
}
public void click_ok_to_delete_alert(){
	 Alert alert = driver.switchTo().alert();
	 alert.dismiss();
	
}



}