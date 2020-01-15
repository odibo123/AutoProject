package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import base.qa.com.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(how=How.NAME,using = "email_create")
	WebElement emailidBtn;
	@FindBy(how=How.CSS,using = "#SubmitCreate > span")
	WebElement CreateAnAccountBtn; 
	@FindBy(how=How.ID,using = "id_gender1")
	WebElement RadioMaleBtn;
	@FindBy(how=How.ID,using = "customer_firstname")
	WebElement  FirstNameBtn;
	@FindBy(how=How.ID,using = "customer_lastname")
	WebElement  LastNameBtn;
	@FindBy(how=How.ID,using = "passwd")
	WebElement  passwdBtn;
	
	@FindBy(how=How.ID,using = "days")
	WebElement  DayOfBirthDropDwn;
	@FindBy(how=How.ID,using = "months")
	WebElement  MonthOfBirthDropDwn;
	@FindBy(how=How.ID,using = "years")
	WebElement  YearOfBirthDropDwn;
	@FindBy(how=How.ID,using = "company")
	WebElement  CompanyBtn;

	@FindBy(how=How.ID,using = "address1")
	WebElement  Line1AddressBtn;
	@FindBy(how=How.ID,using = "address2")
	WebElement   Line2AddressBtn;
	@FindBy(how=How.ID,using = "city")
	WebElement  CityBtn;
	@FindBy(how=How.ID,using = "id_state")
	WebElement  StateDropDwn;
	@FindBy(how=How.ID,using = "postcode")
	WebElement  ZipCodeBtn;
	@FindBy(how=How.ID,using = "id_country")
	WebElement  CountryDropDwnBtn;
	@FindBy(how=How.ID,using = "other")
	WebElement MesssageInputBtn;
	@FindBy(how=How.ID,using = "phone")
	WebElement  HomephoneBtn;
	@FindBy(how=How.ID,using = "phone_mobile")
	WebElement   MobilePhoneBtn;
	@FindBy(how=How.ID,using = "alias")
	WebElement  MyaddressBtn;
	
	@FindBy(how=How.CSS,using = "#submitAccount > span")
	WebElement  RegisterBtn;
	
	@FindBy(how=How.CSS,using = "ol > li")
	WebElement ErrorMessageText;
	@FindBy(how=How.CSS,using = ".account > span")
	WebElement ConfirmedRegisteredUser;
	
	public void enter_emailid(String emailid){
		emailidBtn.sendKeys(emailid);
	}
	public void i_type_email_not_in_use(){
		random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
		emailidBtn.sendKeys("john" + random + "@gmail.com");
	}
	public void click_create_an_account_Btn(){
		CreateAnAccountBtn.click();
	}
public String verify_Error_Message(){
	return ErrorMessageText.getText();
}
public void click_radio_button(){
	RadioMaleBtn.click();
}
public void type_firstname(String firstname){
	FirstNameBtn.sendKeys(firstname);
}
public void type_lastname(String lastname){
	LastNameBtn.sendKeys(lastname);	
}
public void type_password(String myPassword){
	passwdBtn.sendKeys(myPassword);
}
public void selectMydateOfBirth(){
	Select select = new Select(DayOfBirthDropDwn);
			select.selectByIndex(1);
}
public void selectMonthOfBirth(){
	Select select = new Select(MonthOfBirthDropDwn)	;
	select.selectByIndex(6);
}
public void selectYearOfBirth(){
	Select select = new Select(YearOfBirthDropDwn);
	select.selectByIndex(6);
}
public void type_company_name(String company){
	CompanyBtn.sendKeys(company);
}
public void type_newcompany_name(String Company){
	CompanyBtn.sendKeys(Company);
}
public void type_Line_1_Address(String addressLine1){
	Line1AddressBtn.sendKeys(addressLine1);
}
public void type_newLine_1_Address(String AddressLine1){
	Line1AddressBtn.sendKeys(AddressLine1);
}
public void type_Line_2_Address(String addressLine2){
	Line2AddressBtn.sendKeys(addressLine2);
}
public void type_newLine_2_Address(String AddressLine2){
	Line2AddressBtn.sendKeys(AddressLine2);
}
public void type_city_name(String city){
	CityBtn.sendKeys(city);
}
public void type_newcity_name(String City){
	CityBtn.sendKeys(City);
}
public void selectStateDropDown(){
	Select select = new Select(StateDropDwn);
	select.selectByIndex(6);
}
public void selectnewStateDropDown(){
	Select select = new Select(StateDropDwn);
	select.selectByIndex(6);
}
public void selectCountryDropDown(){
	Select select = new Select(CountryDropDwnBtn);
	select.selectByVisibleText("United States");
}
public void selectnewCountryDropDown(){
	Select select = new Select(CountryDropDwnBtn);
	select.selectByVisibleText("United States");
}
public void type_zipcode_name(String zipcode){
	ZipCodeBtn.sendKeys(zipcode);
}
public void typenew_zipcode_name(String Zipcode){
	ZipCodeBtn.sendKeys(Zipcode);
}
public void type_into_MesssageInputBtn(String messages){
	MesssageInputBtn.sendKeys(messages);
}
public void type_into_HomephoneBtn(String HomePhone){
	HomephoneBtn.sendKeys(HomePhone);
}
public void type_into_MobilePhoneBtn(String Mobilephone){
	MobilePhoneBtn.sendKeys(Mobilephone);
}
public void type_into_MyaddressBtn(String AssignedAddress){
	MyaddressBtn.sendKeys(AssignedAddress);	
}
public void clear_Address_box(){
	MyaddressBtn.clear();
}
public void click_register_button(){
	RegisterBtn.click();
}
public String confirm_registered_name(){
	return ConfirmedRegisteredUser.getText();
	
}

}
