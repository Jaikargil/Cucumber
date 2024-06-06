package org.stepdefinition;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.pojo.PojoSeleniumRegister;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoqaRegisterScenarioOutline extends HelperClass{
	
	PojoSeleniumRegister p;
	
	@Given("Config browser")
	public void config_browser() {
	   driverConf();
	   maxWindow();
	}

	@When("Application launch")
	public void application_launch() {
	   browserLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@When("Pass the {string} to firstname textbox")
	public void pass_the_to_firstname_textbox(String firstname) {
	    p = new PojoSeleniumRegister();
	    WebElement getfName = p.getfName();
	    fillTxt(getfName, firstname);
	    
	}

	@When("Pass the {string} to lastname textbox")
	public void pass_the_to_lastname_textbox(String lastname) {
	    p = new PojoSeleniumRegister();
	    WebElement getlName = p.getlName();
	    fillTxt(getlName, lastname);
	}

	@Then("Close window")
	public void close_window() {
	   close();
	}


}
