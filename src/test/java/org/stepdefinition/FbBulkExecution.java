package org.stepdefinition;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.pojo.PojoFb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbBulkExecution extends HelperClass{
	
	PojoFb p;
	
	@Given("To configure the application")
	public void to_configure_the_application() {
	    driverConf();
	    maxWindow();
	}

	@When("To launch the application")
	public void to_launch_the_application() {
	    browserLaunch("https://www.facebook.com");
	}

	@When("To pass valid and invalid {string} on email textbox")
	public void to_pass_valid_and_invalid_on_email_textbox(String email) {
		p = new PojoFb();
		WebElement emailText = p.getEmailText();
		fillTxt(emailText, email);
	   
	}

	@When("To pass valid and invalid {string} on password textbox")
	public void to_pass_valid_and_invalid_on_password_textbox(String pass) {
	    p = new PojoFb();
	    WebElement passText = p.getPassText();
	    fillTxt(passText, pass);
	}

	@When("Enter login")
	public void enter_login() {
		p = new PojoFb();
		WebElement lgnBtn = p.getLgnBtn();
	    click(lgnBtn);
	}

	@Then("Quit the application")
	public void quit_the_application() {
	   close();
	}


}
