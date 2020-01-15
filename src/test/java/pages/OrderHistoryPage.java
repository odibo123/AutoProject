package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.qa.com.TestBase;

public class OrderHistoryPage extends TestBase{
	

	@FindBy(how=How.CSS,using = "#center_column > p")
	WebElement OrderHistoryMessage;
	
	
	public String verify_OrderHistoryMessage(){
	return	OrderHistoryMessage.getText();
	}

}
