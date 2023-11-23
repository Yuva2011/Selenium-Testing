package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	
	public AmazonPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signin;
	
	@FindBy(id = "ap_email")
	private WebElement em;
	
	@FindBy(id = "continue")
	private WebElement con;
	
	@FindBy(id = "ap_password")
	private WebElement pas;
	
	@FindBy(id = "signInSubmit")
	private WebElement sign;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEm() {
		return em;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getPas() {
		return pas;
	}

	public WebElement getSign() {
		return sign;
	}
	
	

}
