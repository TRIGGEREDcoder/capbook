package com.cg.capbook.pagebeans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CapbookRegisterPage {
	
	@FindBy(how=How.CLASS_NAME,name="firstName")
	private WebElement firstName;
	@FindBy(how=How.CLASS_NAME,name="lastName")
	private WebElement lastName;
	@FindBy(how=How.CLASS_NAME,name="emailId")
	private WebElement emailId;
	@FindBy(how=How.CLASS_NAME,name="dob")
	private WebElement dob;
	@FindBy(how=How.CLASS_NAME,name="password")
	private WebElement password;
	@FindBy(how=How.CLASS_NAME,name="gender")
	private List<WebElement> genders;
	@FindBy(how=How.CLASS_NAME,name="submit")
	private WebElement button;
	@FindBy(how=How.ID,id="error")
	private WebElement errorMessage;
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public void setEmailId(String emailId) {
		this.emailId.sendKeys(emailId);
	}
	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public void setGender(String gender) {
		for(WebElement genderSelect : this.genders) 
			if(genderSelect.getAttribute("value").equals(gender))
				genderSelect.click();
	}
	public void clickSubmit() {
		this.button.click();
	}
	public String getErrorMessage() {
		return errorMessage.getText();
	}
}
