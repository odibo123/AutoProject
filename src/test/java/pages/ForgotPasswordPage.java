package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class ForgotPasswordPage extends TestBase{
	
	@FindBy(how=How.CSS,using = "#center_column > div > p")
	WebElement PasswordRequestMessage;
	
	@FindBy(how=How.CSS,using = "#form_forgotpassword > fieldset > p > button > span")
	WebElement RetrievePasswordBtn;
	
	@FindBy(how=How.CSS,using = "#center_column > div > p")
	WebElement PasswordSentConfirmationMessge;
	public String validate_PasswordRequestMessage(){
		return PasswordRequestMessage.getText();
	}

	public void click_RetrievePasswordBtn(){
		RetrievePasswordBtn.click();
	}
	public String validate_PasswordSentConfirmationMessge(){
		return PasswordSentConfirmationMessge.getText();
	}
}
