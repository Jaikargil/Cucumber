package org.stepdefinition;

import java.io.IOException;

import org.baseclass.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.PojoFb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.ToStringPlugin.Exclude;

public class StepDefinition extends HelperClass{

    PojoFb p;

	@Given("Browser Conf")
	public void browser_Conf() {
      driverConf();
      maxWindow();
	}

	@When("Browser Launch")
	public void browser_Launch() {
      browserLaunch("https://www.facebook.com");
	}
   //C:\Users\jaika\eclipse-workspace\CucumberDemo\Excel\FB.xlsx
	@When("Username")
	public void username() throws IOException {
		p = new PojoFb();
		WebElement emailText = p.getEmailText();
		String emailvalue = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\FB.xlsx", "Sheet1", 1, 0);
        fillTxt(emailText, emailvalue);
	}

	@When("Password")
	public void password() throws IOException {
		p = new PojoFb();
		WebElement passText = p.getPassText();
		String passvalue = excelRead("C:\\Users\\jaika\\eclipse-workspace\\CucumberDemo\\Excel\\FB.xlsx", "Sheet1", 1, 1);
        fillTxt(passText, passvalue);
	}

	@When("Click login")
	public void click_login() {
		p = new PojoFb();
		WebElement lgnBtn = p.getLgnBtn();
        click(lgnBtn);
	}

	@Then("Close facebook")
	public void close_facebook() {
          close();
	}


}
