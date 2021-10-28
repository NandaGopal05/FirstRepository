package org.pom;

import org.maven.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotel extends LibGlobal {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement roomType;
	
	@FindBy(name = "room_nos")
	private WebElement numOfRoom;
	
	@FindBy(name = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(name = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(name = "adult_room")
	private WebElement adultsInRoom;
	
	@FindBy(name = "child_room")
	private WebElement childInRoom;
	
	@FindBy(name = "Submit")
	private WebElement searchBtn;


	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRoom() {
		return numOfRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	
	public WebElement getAdultsInRoom() {
		return adultsInRoom;
	}

	public WebElement getChildInRoom() {
		return childInRoom;
	}
	
	public WebElement getSearchBtn() {
		return searchBtn;
	}
}
