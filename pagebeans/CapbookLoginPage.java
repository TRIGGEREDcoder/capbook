package com.cg.capbook.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CapbookLoginPage {
	
	@FindBy(how=How.ID,id="login_field")
	private WebElement emailId;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	@FindBy(className="btn")
	private WebElement button;
	@FindBy(how=How.XPATH,xpath="//div[@class='container']\"")
	private WebElement actualErrorMessage;
	public CapbookLoginPage() {}
	
	public String getEmailId() {
		return emailId.getAttribute("value");
	}
	public void setEmailId(String emailId) {
		this.emailId.sendKeys(emailId);
	}
	public String getPassword() {
		return password.getAttribute("value");
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickSignIn() {
		button.submit();
	}
	public String getActualErrorMessage() {
		return actualErrorMessage.getText();
	}	
}
