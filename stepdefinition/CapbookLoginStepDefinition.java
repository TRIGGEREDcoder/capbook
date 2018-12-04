package com.cg.capbook.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.capbook.pagebeans.CapbookLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CapbookLoginStepDefinition {
	
	private WebDriver driver;
	private CapbookLoginPage page;
	
	@Given("^User is on Capbook login page$")
	public void user_is_on_Capbook_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("@10.220.57.63:4200");
		page=PageFactory.initElements(driver, CapbookLoginPage.class);
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		page.setEmailId("dibyaratnam@gmail.com");
		page.setPassword("11111");
		page.clickSignIn();
	}

	@Then("^User must be directed to his/her profile page$")
	public void user_must_be_directed_to_his_her_profile_page() throws Throwable {
		String expected="CapBook";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}

	@When("^User enters invalid username and password$")
	public void user_enters_invalid_username_and_password() throws Throwable {
		page.setEmailId("dibyaratna@gmail.com");
		page.setPassword("2222");
		page.clickSignIn();
	}

	@Then("^'Incorrect username and password!Try again' message shold be displayed$")
	public void incorrect_username_and_password_Try_again_message_shold_be_displayed() throws Throwable {
		String expected="Incorrect username and password!Try again";//change
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}
	@When("^User enters nothing in the username or password field$")
	public void user_enters_nothing_in_the_username_or_password_field() throws Throwable {
		page.setEmailId(" ");
		page.setPassword(" ");
		page.clickSignIn();
	}

	@Then("^'Require valid credentials' message should be displayed$")
	public void require_valid_credentials_message_should_be_displayed() throws Throwable {
		String expected="Require valid credentials";//change
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		driver.close();
	}


}
