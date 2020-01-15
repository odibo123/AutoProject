package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class MyAccountPage extends TestBase{
	
	@FindBy(how=How.CSS,using = "a > span")
	 WebElement UsernameTxt;
	
	@FindBy(how=How.CSS,using = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
	WebElement SignOutLink;

	@FindBy(how=How.CSS,using = "#block-history > p")
	 WebElement CreditCardMessage;
	
	
	@FindBy(how=How.CSS,using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(2) > a")
	 WebElement CreditSlipsField;
	
	@FindBy(how=How.CSS,using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(1) > a > span")
	 WebElement OrderHistoryAndDetailsField;
	
	@FindBy(how=How.CSS,using = "#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a > span")
	WebElement MyPersonalInformationField;
	

	@FindBy(how=How.CSS,using = "#center_column > div > p.info-title")
	WebElement MyPersonalInformationMessage;
	
	public String validate_logged_in_username(){
	return UsernameTxt.getText();
	}

	public void click_CreditSlipsField(){
		CreditSlipsField.click();
	}
	
	public String confirm_CreditCardMessage(){
	return	CreditCardMessage.getText();
	}
	public void click_OrderHistoryAndDetailsField(){
		OrderHistoryAndDetailsField.click();
	}
	public void click_MyPersonalInformationField(){
		MyPersonalInformationField.click();
}
	
	public void click_SignOutLink(){
		SignOutLink.click();
	}
	public String validate_MyPersonalInformationMessage(){
		return	 MyPersonalInformationMessage.getText();
	}
}