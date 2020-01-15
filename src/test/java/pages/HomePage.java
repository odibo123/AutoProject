package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;

public class HomePage extends TestBase{
	//public HomePage() {
	//	PageFactory.initElements(driver, this);
	//}
	
	

	@FindBy(how=How.XPATH,using = "//*[@id='contact-link']/a")
	 WebElement ContactusLink;
	
	@FindBy(how=How.CSS,using = ".logo")
	WebElement LogoLabel;

	@FindBy(how=How.LINK_TEXT,using = "Sign in")
	 WebElement SignInlnk;
	
	@FindBy(how=How.CSS, using= "#search_query_top")
	WebElement SearchTextBox;
	
	@FindBy(how=How.NAME, using = "submit_search")
	WebElement SearchIconBox;
	
	@FindBy(how=How.XPATH, using = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement  WomenLink;
	
	@FindBy(how=How.LINK_TEXT, using = "Summer Dresses")
	WebElement SummerDressLabel;
	
	
	public boolean I_verify_LogoLabel(){
		return LogoLabel.isDisplayed();
       }
	public void I_click_signInLink(){
		SignInlnk.click();	
	}
	public ContactUsPage click_Contact_UsLink(){
		ContactusLink.click();	
		return new ContactUsPage();
	}
	public void type_Choice_of_clothes(String clothing){
		SearchTextBox.sendKeys(clothing);	
	}
	public void click_on_Search_Text_Box(){
		SearchTextBox.click();
	}
	public void I_click_Search_Icon_Box(){
		SearchIconBox.click();
	}
	public void click_SummerDressLabel(){
		Actions action = new Actions(driver);
		action.moveToElement(WomenLink).build().perform();
		SummerDressLabel.click();
	}
	
}
