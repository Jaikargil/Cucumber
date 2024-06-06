package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

public class PojoSeleniumRegister extends HelperClass{
	
	// Non parameterized constructors
		public PojoSeleniumRegister() {
		   PageFactory.initElements(driver, this);
		}
		// find only one webelement
		@FindBy(xpath="//a[text()='Go To Registration ']")
		private WebElement register;
		
		// first name
		@FindBy(name="firstName")
		private WebElement fName;
		
		//last name
		@FindBys({
			@FindBy(name="lastName"),
			@FindBy(xpath="//input[@id='last-name']")		
		})
		private WebElement lName;
		
		//email
		@FindAll({
			@FindBy(id="email"),
			@FindBy(name="email")
		})
		private WebElement emailTxt;
		
		//mobile
		@FindAll({
			@FindBy(id="mobile"),
			@FindBy(name="mobile")
		})
		private WebElement mobileTxt;
		
		@FindBy(name="country")
		private WebElement ctry;
		
		@FindBy(id="city")
		private WebElement city;
		
		@FindBy(name="message")
		private WebElement msg;

		//Getters
		public WebElement getRegister() {
			return register;
		}

		public WebElement getfName() {
			return fName;
		}
		public WebElement getlName() {
			return lName;
		}

		public WebElement getEmailTxt() {
			return emailTxt;
		}
		public WebElement getMobileTxt() {
			return mobileTxt;
		}
		public WebElement getCtry() {
			return ctry;
		}
		public WebElement getCity() {
			return city;
		}
		public WebElement getMsg() {
			return msg;
		}

}
