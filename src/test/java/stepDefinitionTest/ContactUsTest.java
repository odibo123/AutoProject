package stepDefinitionTest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase{
	ContactUsPage  contactUsPage  = new ContactUsPage ();
	HomePage  homePage  = new HomePage ();
	@Given("^log into contact us page$")
	public void log_into_contact_us_page() throws Throwable {
    HomePage homePage =PageFactory.initElements(driver, HomePage .class);
		homePage.click_Contact_UsLink();
	}

	@Then("^I should verify title of contact us page$")
	public void i_should_verify_title_of_contact_us_page() throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class);
	String contactUsTitle=	contactUsPage .verify_contact_us_Page_Title();
	System.out.println("current title page is "+contactUsTitle);
	Assert.assertEquals(contactUsPage.verify_contact_us_Page_Title().contains("Contact us - My Store"), true);
	}
	@Then("^I fill in contact Us details by choosing  subject heading and entering email and \"([^\"]*)\" and chooses a file$")
	public void i_fill_in_contact_Us_details_by_choosing_subject_heading_and_entering_email_and_and_chooses_a_file(String orderReference) throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class);
		contactUsPage.I_Select_Customer_Service_From_SubjectHeadingDropdown();
		contactUsPage.type_my_email();
		contactUsPage.I_enter_quanitity_on_order_referencetxt(orderReference);
		//contactUsPage.I_choose_file_path(); 
		
	}
	@Then("^logs in after  typing  a \"([^\"]*)\" of enquiry$")
	public void logs_in_after_typing_a_of_enquiry(String message) throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class);
		contactUsPage.I_type_message_I_Want_To_send(message);
		contactUsPage.I_should_click_Send_Button();
	}
	@Then("^I should see  the  \"([^\"]*)\" Your message has been successfully sent to our team\\.\"$")
	public void i_should_see_the_Your_message_has_been_successfully_sent_to_our_team(String arg1) throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class);
	String confirmedMessage=	contactUsPage.verify_message_from_team();
	System.out.println("The message received is "+confirmedMessage);
	Assert.assertEquals("Your message has been successfully sent to our team.", confirmedMessage);
	}

	@When("^I attempt to log in without typing on the \"([^\"]*)\" box$")
	public void i_attempt_to_log_in_without_typing_on_the_box(String emptyMessage) throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class); 
		contactUsPage .I_do_not_type_on_messagebox(emptyMessage);
		contactUsPage.I_should_click_Send_Button();
	   
	}
	@Then("^I should see an error message$")
	public void i_should_see_an_error_message() throws Throwable {
		ContactUsPage  contactUsPage  = PageFactory.initElements(driver, ContactUsPage.class);
		String messageCannotBeBlank=contactUsPage.validate_MessageCannotBeBlankMessage();
		System.out.println(messageCannotBeBlank);
	}
}
