package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.qa.com.TestBase;

public class ProductsListingPage  extends TestBase {
	
//  All Objects found are declared 
	@FindBy(how=How.CSS, using = "img.replace-2x.img-responsive")
     WebElement ProductQuickview;
	
	@FindBy(how=How.CSS,using= "#best-sellers_block_right > div > ul > li:nth-child(1) > div > h5 > a")
	WebElement ProductTitle;
	
	@FindBy(how=How.XPATH,using= "//span[@class='price'][contains(text(),'$16.40')]")
	WebElement ProductPrice;
	
	@FindBy(how=How.XPATH,using= "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	 WebElement ProceedToCheckoutButton;
	
	@FindBy(how=How.ID, using = "layered_id_attribute_group_1")
	WebElement SizeBtn;
	
	@FindBy(how=How.ID, using = "layered_id_attribute_group_8")
	WebElement ColourBtn;
	
	@FindBy(how=How.ID, using = "layered_id_feature_1")
	WebElement CompositionBtn;
	
	@FindBy(how=How.ID, using = "layered_id_feature_11")
	WebElement StylesBtn;
	
	@FindBy(how=How.ID, using = "layered_id_feature_21")
	WebElement PropertyBtn;
	
	@FindBy(how=How.ID, using = "layered_quantity_1")
	WebElement AvailabilityBtn;
	
	@FindBy(how=How.ID, using = "layered_condition_new")
	WebElement ConditionBtn;
	
	@FindBy(how=How.XPATH, using = "//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")
	WebElement ChosenItemBtn;
	@FindBy(how=How.XPATH, using = "//*[@id='layered_price_slider']/a[1]")
	WebElement PriceRangeSlider1;
	//@FindBy(how=How.XPATH, using = "//span[contains(text(),'Add to cart')]")
	//WebElement Add2CartButton;

	@FindBy(how=How.XPATH, using = "//*[@id='layered_price_slider']/a[2]")
	WebElement PriceRangeSlder2;
	
	//create all the methods
	public boolean I_Verify_ProductQuickview_Image(){
	return ProductQuickview.isDisplayed();
	}
	
	public String verify_Product_Title(){
		return ProductTitle.getText();
	}
	
	public String verify_Product_Price(){
	return ProductPrice.getText();
	}
	public void click_ProductQuickview_Item(){
		 ProductQuickview.click();
	}
	public String validate_myProduct_Title(){
		return driver.getTitle();
		}
	public void I_click_on_ProceedToCheckoutButton(){
		 ProceedToCheckoutButton.click();
	}
	public void change_price_range() throws InterruptedException{
		
		Dimension dim=	PriceRangeSlider1.getSize();
		int x =dim.getWidth();
		//System.out.println(x);
		
		     Actions action = new Actions(driver);
		     action.clickAndHold(PriceRangeSlider1).moveByOffset(0, 0).release().build().perform();		
	}
		public void change_further_price_range() throws InterruptedException{
		Dimension dime=	PriceRangeSlder2.getSize();
	     int y=	dime.getWidth();
			Actions actions = new Actions(driver);
			actions .clickAndHold(PriceRangeSlder2).moveByOffset(-183, 0).release().build().perform();		
		}
		public void click_SizeBtn(){
			SizeBtn.click();
		}
		public void click_ColourBtn(){
			ColourBtn.click();	
		}
		public void click_CompositionBtn(){
			CompositionBtn.click();
		}
		public void click_StylesBtn(){
			StylesBtn.click();
		}
		public void click_PropertyBtn(){
			PropertyBtn.click();
		}
		public void click_AvailabilityBtn(){
			AvailabilityBtn.click();
		}
		public void click_ConditionBtn(){
			ConditionBtn.click();
		}
		public void click_ChosenItemBtn(){
			ChosenItemBtn.click();
		}
		
		/*public void I_click__ONAdd2CartButtotn(){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",Add2CartButton);
			
		}*/
}
