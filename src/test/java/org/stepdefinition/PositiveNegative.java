package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PositiveNegative extends BaseClass {
	
	AmazonPojo a;
	@Given("user has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("user has to launch the url of amazon signin page")
	public void user_has_to_launch_the_url_of_amazon_signin_page() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("user has to click the signin button")
	public void user_has_to_click_the_signin_button() {
	    a = new AmazonPojo();
	    clickBtn(a.getSignin());
	}

	@When("user has to pass the valid data{string} in email field")
	public void user_has_to_pass_the_valid_data_in_email_field(String em) {
	    a = new AmazonPojo();
	    passText(em, a.getEm());
	}

	@When("user has to click the continue button")
	public void user_has_to_click_the_continue_button() {
	   clickBtn(a.getCon());
	}

	@When("user has to pass the valid data{string} in password field")
	public void user_has_to_pass_the_valid_data_in_password_field(String pas) {
	    a = new AmazonPojo();
	    passText(pas, a.getPas());
	}

	@When("user has to click signin button")
	public void user_has_to_click_signin_button() {
	    clickBtn(a.getSign());
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}



}
