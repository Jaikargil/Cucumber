package org.stepdefinition;

import java.io.IOException;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.pojo.PojoSeleniumRegister;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoqaRegister extends HelperClass {
	
	PojoSeleniumRegister p;

	@Given("To execute the browser config")
	public void to_execute_the_browser_config() {
		driverConf();
		maxWindow();
	}

	@When("To execute application launch")
	public void to_execute_application_launch() {
	   browserLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
	}
    //C:\Users\jaika\eclipse-workspace\CucumberDemo\Excel\Q4_Toolsqa_registration.xlsx
	@When("To fill valid firstname")
	public void to_fill_valid_firstname() throws IOException {
		 p = new PojoSeleniumRegister();
		 WebElement getfName = p.getfName();
	     String fristname = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 0, 1);
	     fillTxt(getfName, fristname);
	}

	@When("To fill Valid lastname")
	public void to_fill_Valid_lastname() throws IOException {
		p= new PojoSeleniumRegister();
		WebElement getlName = p.getlName();
		String lastname = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 1, 1);
		fillTxt(getlName, lastname);
	}

	@When("To fill valid emailid")
	public void to_fill_valid_emailid() throws IOException {
		p = new PojoSeleniumRegister();
		WebElement emailTxt = p.getEmailTxt();
		String email = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 2, 1);
		fillTxt(emailTxt, email);
	}

	@When("To fill valid mobileno")
	public void to_fill_valid_mobileno() throws IOException {
		p = new PojoSeleniumRegister();
		WebElement mobileTxt = p.getMobileTxt();
		String mobile = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 3, 1);
		fillTxt(mobileTxt, mobile);
	}

	@When("To fill valid country")
	public void to_fill_valid_country() throws IOException {
		p = new PojoSeleniumRegister();
		WebElement ctry = p.getCtry();
		String country = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 4, 1);
		selectByVisibleText(ctry, country);
		
	}

	@When("To fill valid city")
	public void to_fill_valid_city() throws IOException {
		p = new PojoSeleniumRegister();
		WebElement city = p.getCity();
		String cityname = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 5, 1);
	    fillTxt(city, cityname);
	}

	@When("To fill message")
	public void to_fill_message() throws IOException {
		p = new PojoSeleniumRegister();
		WebElement msg = p.getMsg();
		String message = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\Q4_Toolsqa_registration.xlsx", "Sheet1", 6, 1);
		fillTxt(msg, message);
	}

	@Then("Close application")
	public void close_application() {
		
	}



}
