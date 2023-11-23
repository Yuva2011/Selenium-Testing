package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonsignin extends BaseClass {
	
	AmazonPojo a;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	    
	}

	@When("To lauch the url of amazon sigin page")
	public void to_lauch_the_url_of_amazon_sigin_page() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To click the Signin button")
	public void to_click_the_Signin_button() {
		a = new AmazonPojo();
		clickBtn(a.getSignin());
	}

	@When("To pass the valid email id or mobile number in email field")
	public void to_pass_the_valid_email_id_or_mobile_number_in_email_field() {
	   a = new AmazonPojo();
	   passText("9600575685", a.getEm());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	    a = new AmazonPojo();
	    clickBtn(a.getCon());
	}

	@When("To pass the valid password in password field")
	public void to_pass_the_valid_password_in_password_field() {
	    a = new AmazonPojo();
	    passText("Yuva@2011", a.getPas());
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
	    a = new AmazonPojo();
	    clickBtn(a.getSign());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();
	}


}
