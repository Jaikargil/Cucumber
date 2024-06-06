package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoRedbus extends HelperClass {

	public PojoRedbus() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement account;
	
	@FindBy(xpath="//span[text()='Login/ Sign Up']")
	private WebElement signup;
	
	@FindBy(id="mobileNoInp")
	private WebElement mobile;
    
	//getters
	public WebElement getAccount() {
		return account;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getMobile() {
		return mobile;
	}
	
	
	
}
