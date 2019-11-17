package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;

public class HomePage extends TestBase{
	//public HomePage() {
	//	PageFactory.initElements(driver, this);
	//}
	
	
	
		@FindBy(how=How.CSS,using = ".logo")
		WebElement LogoLabel;

	@FindBy(how=How.LINK_TEXT,using = "Sign in")
	 WebElement SignInlnk;
	
	
	
	public boolean I_verify_LogoLabel(){
		return LogoLabel.isDisplayed();
       }
	public void I_click_signInLink(){
		SignInlnk.click();
		
	}
}
