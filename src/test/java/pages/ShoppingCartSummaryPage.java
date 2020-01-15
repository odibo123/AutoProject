package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.qa.com.TestBase;

public class ShoppingCartSummaryPage extends TestBase {
    //create object 
	
	@FindBy(how=How.CSS, using= ".icon-minus")
	WebElement QtyNegativeBtn;
	
	@FindBy(how=How.XPATH, using= "//p[contains(.,'Your shopping cart is empty.')]")
	WebElement OrderCartConfirmationMessageTxt;
	
	@FindBy(how=How.ID, using= "cart_title")
	WebElement ShoppingCartSummaryTxt;
	
   //actions or methods
	public void click_QtyNegativeBtn(){
		 QtyNegativeBtn.click();
	}
	
	public String verifyOrderCartConfirmationMessageTxt(){	
		WebDriverWait wait = new WebDriverWait(driver,20);
		  WebElement element = wait.until(
		                       ExpectedConditions.visibilityOf(OrderCartConfirmationMessageTxt));
		  element.isDisplayed();
	return	OrderCartConfirmationMessageTxt.getText();
	}
	
	public String verifyShoppingCartSummary(){
	return ShoppingCartSummaryTxt.getText();
	}
}
