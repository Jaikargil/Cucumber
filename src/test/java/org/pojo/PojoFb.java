package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PojoFb extends HelperClass{

		
		// Non parameterized constructors
		public PojoFb() {
		   PageFactory.initElements(driver, this);
		}
		
		// find only one webelement
		@FindBy(name="email")
		private WebElement emailText;
		
		@FindBy(id="pass")
		private WebElement passText;
		
		@FindBy(name="login")
		private WebElement lgnBtn;
		

		//Getters
		public WebElement getEmailText() {
			return emailText;
		}

		public WebElement getPassText() {
			return passText;
		}
		public WebElement getLgnBtn() {
			return lgnBtn;
		}
	
}



