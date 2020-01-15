package stepDefinitionTest;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import base.qa.com.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyAccountPage;
import pages.OrderHistoryPage;

public class OrderHistoryAndDetailsTest extends TestBase{
	MyAccountPage myAccountPage = new MyAccountPage();
	OrderHistoryPage  orderHistoryPage  = new OrderHistoryPage ();
	@When("^I click on Order History And Details text field$")
	public void i_click_on_Order_History_And_Details_text_field() throws Throwable {
		MyAccountPage  myAccountPage = PageFactory.initElements(driver, MyAccountPage .class);
		myAccountPage.click_OrderHistoryAndDetailsField();
	}

	@Then("^I should see details of my order history$")
	public void i_should_see_details_of_my_order_history() throws Throwable {
		OrderHistoryPage  orderHistoryPage= PageFactory.initElements(driver,OrderHistoryPage.class);
	String orderHistoryMesssage=orderHistoryPage.verify_OrderHistoryMessage();
	System.out.println("Messsage displayed is :"+orderHistoryMesssage);
	Assert.assertEquals(orderHistoryMesssage,orderHistoryPage.verify_OrderHistoryMessage() );
	}
}
