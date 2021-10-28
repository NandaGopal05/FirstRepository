package org.pom;

import org.maven.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends LibGlobal {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name = "order_no")
	private WebElement orderNum;

	public WebElement getOrderNum() {
		return orderNum;
	}
	
}
