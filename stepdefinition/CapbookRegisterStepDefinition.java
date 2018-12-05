package com.cg.capbook.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.capbook.pagebeans.CapbookRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CapbookRegisterStepDefinition {
	
	private WebDriver driver;
	private CapbookRegisterPage page;
	@Given("^User is on Capbook registration page$")
	public void user_is_on_Capbook_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("@10.220.57.63:4200");
		page=PageFactory.initElements(driver, CapbookRegisterPage.class);
	}

	@When("^User enters all required details correctly$")
	public void user_enters_all_required_details_correctly() throws Throwable {
		page.setFirstName("Dibyaratnam");
		page.setLastName("Samarlia");
		page.setDob("23031995");
		page.setEmailId("dibyaratnam@gmail.com");
		page.setGender("Male");
		page.setPassword("12345");
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
		page.clickSubmit();
	}

	@Then("^User must be directed to welcome user page$")
	public void user_must_be_directed_to_welcome_user_page() throws Throwable {
		String expected=" ";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}

	@When("^User enters only first name correct and other details incorrect$")
	public void user_enters_only_first_name_correct_and_other_details_incorrect() throws Throwable {
		page.setFirstName("Dibyaratnam");
		page.setLastName("Samarlia123");
		page.setDob("230319951");
		page.setEmailId("dibyaratnamgmail.com");
		page.setGender("Male");
		page.setPassword("123452");
	}

	@Then("^'Enter valid details' message should be displayed$")
	public void enter_valid_details_message_should_be_displayed() throws Throwable {
		String expected=" ";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}

	@When("^User enters only last name correct and other details incorrect$")
	public void user_enters_only_last_name_correct_and_other_details_incorrect() throws Throwable {
		page.setFirstName("Dibyaratnam1@");
		page.setLastName("Samarlia");
		page.setDob("230301995");
		page.setEmailId("dibyaratnamgmail.com");
		page.setGender("Male");
		page.setPassword("123452");
	}

	@When("^User enters invalid emailId but other details correctly$")
	public void user_enters_invalid_emailId_but_other_details_correctly() throws Throwable {
		page.setFirstName("Dibyaratnam");
		page.setLastName("Samarlia");
		page.setDob("23031995");
		page.setEmailId("dibyaratnamgmail.com");
		page.setGender("Male");
		page.setPassword("123452");
	}

	@Then("^'Enter valid email' message should be displayed$")
	public void enter_valid_email_message_should_be_displayed() throws Throwable {
		String expected=" ";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}

	@When("^User enters all required details correctly but invalid password pattern$")
	public void user_enters_all_required_details_correctly_but_invalid_password_pattern() throws Throwable {
		page.setFirstName("Dibyaratnam");
		page.setLastName("Samarlia");
		page.setDob("23031995");
		page.setEmailId("dibyaratnam@gmail.com");
		page.setGender("Male");
		page.setPassword("123452!@");
	}

	@Then("^'Choose a suggested pattern password' message should be displayed$")
	public void choose_a_suggested_pattern_password_message_should_be_displayed() throws Throwable {
		String expected=" ";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();

	}
}
