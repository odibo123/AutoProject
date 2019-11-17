package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(how=How.ID,using ="email")	
	 WebElement EmailBtn;

	@FindBy(how=How.CSS,using = "#passwd")
       WebElement PasswordBtn;

	@FindBy(how=How.XPATH,using = "//p[@class='submit']//span[1]")
	WebElement SignInBtn;
	
	@FindBy(how=How.CSS,using = "ol > li")
	WebElement authentication_failedErrorMessage;

	@FindBy(how=How.XPATH,using = "//*[@id='center_column']/div[1]/ol/li")
	WebElement Invalid_passwordErrorMessage;
	
	@FindBy(how=How.CSS,using = "#center_column > div.alert.alert-danger > ol > li")
	WebElement EmailErrorMessage;
	public void enter_email(String emailAddress){
		
		EmailBtn.sendKeys(emailAddress);
	}

	public void enter_password(String password){
		PasswordBtn.sendKeys(password);
			
	}
	public MyAccountPage click_SignInBtn(){
		SignInBtn.click();
		return new MyAccountPage();
	}
	
	public void enter_incorrect_emailAddress(String email){
		EmailBtn.sendKeys(email);
	}
	public void enter_incorrect_password(String passwd){
		PasswordBtn.sendKeys(passwd);
	}
	public String verify_authentication_failedErrorMessage(){
		return authentication_failedErrorMessage.getText();
	}
	public String verify_Invalid_passwordErrorMessage(){
		return Invalid_passwordErrorMessage.getText();
	}
	public String verify_EmailErrorMessage(){
		return EmailErrorMessage.getText();
	}
	
	public void enter_blank_emailAddress(String MyemailAddress){
		EmailBtn.sendKeys(MyemailAddress);
	}
	public void enter_blank_passsword(String Mypasssword){
		EmailBtn.sendKeys(Mypasssword);
	}
}
