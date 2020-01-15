package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.qa.com.TestBase;

public class AddressPage extends TestBase {
	
	//@FindBy(how=How.CSS,using = css=#address_delivery > .address_city)
	//@FindBy(how=How.CSS,using = "#address_delivery > .address_city")
	@FindBy(how=How.CSS,using = "#address_delivery")
	WebElement DeliveryOrBillingAddressTxtField;
	
	@FindBy(how=How.CSS,using = "#center_column > form > p > button > span")
	WebElement AddressProccedToCheckoutBox;
	
	@FindBy(how=How.ID,using = "id_address_delivery")
	WebElement AddressDropdown;
	
	@FindBy(how=How.CSS,using = "#address_invoice_form span")
	WebElement AddNewAddressArrow;
	
	@FindBy(how=How.ID,using = "addressesAreEquals")
	WebElement DeliveryAddressBtn;
	
	@FindBy(how=How.CSS,using = "#submitAddress > span")
	WebElement SavedBtn;
	
	public String i_verify_DeliveryOrBillingAddress(){
	return	DeliveryOrBillingAddressTxtField.getText();
	}
	
	
	public void click_AddressProccedToCheckoutBox(){
		AddressProccedToCheckoutBox.click();
	}
	
	public void select_addressDropdown(){
		Select select = new Select(AddressDropdown);
		select .selectByVisibleText("My address");
	}
	public void click_AddNewAddressArrow(){
		AddNewAddressArrow.click();
	}
	public void click_DeliveryAddressBtn(){
		DeliveryAddressBtn.click();
	}
	public void click_SavedBtn(){
		SavedBtn.click();
	}
}
