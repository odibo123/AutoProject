package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class ShippingPage extends TestBase {
	
	@FindBy(how=How.CSS,using = "#form > p > button > span")
	WebElement ShippingProccedToCheckoutBox;
	
	@FindBy(how=How.ID,using = "cgv")
	WebElement TermsOfServiceBox;
	
	
	
	public void click_ShippingProccedToCheckoutBox(){
		ShippingProccedToCheckoutBox.click();
	}

	
	public void Tick_TermsOfServiceBox(){
		TermsOfServiceBox.click();
	}

}
