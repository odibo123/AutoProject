package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(how=How.CSS,using = "#center_column > h1")
	WebElement PleaseChooseYourPaymentText;
	
	@FindBy(how=How.CSS,using = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a > span")	
	WebElement PayByBankWireInputArrow;
	
	@FindBy(how=How.CSS,using = "#cart_navigation > button > span")
	WebElement I_confirm_my_orderText;
	
	@FindBy(how=How.XPATH,using = "//div[@class='box'] ")
	WebElement OrderDetailsBox;
public String verify_Payment_Page_Title(){
		return driver.getTitle();	
		
	}
public String verify_PleaseChooseYourPaymentText(){
	return PleaseChooseYourPaymentText.getText();
}
public void click_PayByBankWireInputArrow(){
	PayByBankWireInputArrow.click();
}
public void click_I_confirm_my_orderText(){
	I_confirm_my_orderText.click();
}

public String verify_OrderDetailsBox(){
	return OrderDetailsBox.getText();
}
}
