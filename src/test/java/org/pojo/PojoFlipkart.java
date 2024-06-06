package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PojoFlipkart {
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
	private WebElement mobile;

	//getters
	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobile() {
		return mobile;
	}

}
