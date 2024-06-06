package org.pojo;

import org.baseclass.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoHotelBooking extends HelperClass {

	// Non parameterized constructors
	public PojoHotelBooking() {
		PageFactory.initElements(driver, this);
	}

	// private methods

	@FindBy(id = "username") // username
	private WebElement uName;

	@FindBy(name = "password") // password
	private WebElement pass;

	@FindBy(id = "login") // login
	private WebElement log;

	@FindAll({ // Location
			@FindBy(name = "location"), @FindBy(id = "location") })
	private WebElement location;

	@FindAll({ // hotels
			@FindBy(name = "hotels"), @FindBy(id = "hotels") })
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']") // Room_type
	private WebElement roomtType;
	
	@FindBy(xpath="//select[@id='room_nos']")   // number of room
	private WebElement numOfRoom;

	@FindBy(xpath = "//input[@name='datepick_in']") // check IN date
	private WebElement checkIn;

	@FindBy(xpath = "//input[@id='datepick_out']") // checl out date
	private WebElement checkOut;

	@FindAll({ // adult per room
			@FindBy(id = "adult_room"), @FindBy(name = "adult_room") })
	private WebElement adultRoom;

	@FindAll({ // submit button
			@FindBy(name = "Submit"), @FindBy(id = "Submit") })
	private WebElement submit;
	
	@FindBy(id="child_room")
	private WebElement childroom;

	// getters
	public WebElement getuName() {
		return uName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtType() {
		return roomtType;
	}
	public WebElement getNumOfRoom() {
		return numOfRoom;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}
    
	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
