package com.msp.framework.stepdefinition;

import com.msp.framework.base.TestBase;
import com.msp.framework.pages.AccountOperationsPage;
import com.msp.framework.pages.PersonaldetialsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PersonalInfoUpdate extends TestBase{

	@When("^I click on My personal information button from My account page$")
	public void i_click_on_My_personal_information_button_from_My_account_page() throws Throwable {
		
		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.Manage_my_personal_information();
	}

	@Then("^I directed to the Account Creation Page$")
	public void i_directed_to_the_Account_Creation_Page() throws Throwable {
		AccountOperationsPage orderpage = new AccountOperationsPage(driver);
		orderpage.AccountsPage(driver);
	}



	@When("^I Update \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click on save$")
	public void i_update_somethingsomethingsomethingsomethingsomethingsomethingsomethingsomething_and_click_on_save(String accountname, String phone, String accountnumber, String rating, String billingaddress, String customerpriority, String sla, String description) throws Throwable {

		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.userDetails(accountname,phone,accountnumber,rating,billingaddress,customerpriority,sla,description);
		PDP.SaveAccountBtn();
 	}

	@Then("^I display with a successfull message in Your Personal Information section$")
	public void i_display_with_a_successfull_message_in_Your_Personal_Information_section() throws Throwable {
		
		PersonaldetialsPage PDP= new PersonaldetialsPage(driver);
		PDP.verifyMessage();
	}
}
