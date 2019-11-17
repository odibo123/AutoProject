package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class MyAccountPage extends TestBase{
	
	@FindBy(how=How.CSS,using = "a > span")
	 WebElement UsernameTxt;
	
	
	
	
	public String validate_logged_in_username(){
	return UsernameTxt.getText();
	}

	
	
}
