package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.qa.com.TestBase;

public class ContactUsPage extends TestBase {

	
	public String verify_contact_us_Page_Title(){
		
		return driver.getTitle();	
		
	}
	
	@FindBy(how=How.ID,using = "id_contact")
	WebElement SubjectHeadingDropdown;
	
	@FindBy(how=How.CSS,using = "#email")
	WebElement EmailAddressTxtField;
	
	@FindBy(how=How.NAME,using = "id_order")
	WebElement Order_Reference_Text_Field;
	
	@FindBy(how=How.ID,using = "fileUpload")
	WebElement ChooseFileBttn;
	
	@FindBy(how=How.ID,using = "message")
	WebElement  MessageTextBox;

	@FindBy(how=How.CSS,using = "#submitMessage > span")
	WebElement SendBtn;
	@FindBy(how=How.CSS,using = "#center_column > div > ol > li")
	WebElement MessageCannotBeBlankMessage;
	
	@FindBy(how=How.CSS,using = "#center_column > p")
	WebElement MessageReceivedTxt;
	//actions
	
	public void I_Select_Customer_Service_From_SubjectHeadingDropdown(){
		Select dropdown= new Select(SubjectHeadingDropdown);
		dropdown.selectByIndex(1);
		
	}

	public void type_my_email(){
		     random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
			EmailAddressTxtField.sendKeys("mike" + random + "@gmail.com");
		//String generatedString= RandomStringUtils.randomAlphabetic(3);
		//return (generatedString+ "gmail.com");
		//EmailAddressTxtField.sendKeys("generatedString+ "gmail.com");
				
	}
	public void I_enter_quanitity_on_order_referencetxt(String orderReference){
		//Order_Reference_Txt_Field.sendKeys(orderReference);
		Order_Reference_Text_Field.sendKeys(orderReference);
	}
	
	public void I_choose_file_path(){
		ChooseFileBttn.sendKeys("C:\\Users\\User\\Desktop\\page obj select.txt");
	}
	
	public void I_type_message_I_Want_To_send(String message){
		MessageTextBox.sendKeys(message);
	}
	public void I_do_not_type_on_messagebox(String emptyMessage){
		MessageTextBox.sendKeys(emptyMessage);
	}
	public void I_should_click_Send_Button(){
		SendBtn.click();
	}
	
	public String verify_message_from_team(){
		return MessageReceivedTxt.getText();
	}
	
	public String validate_MessageCannotBeBlankMessage(){
		return MessageCannotBeBlankMessage.getText();
	}
	
}
