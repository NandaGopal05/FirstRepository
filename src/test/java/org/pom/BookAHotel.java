package org.pom;

import org.maven.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends LibGlobal {
	
	public BookAHotel() {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(name = "first_name")
	private WebElement frstName;
	
	@FindBy(name = "last_name")
	private WebElement lstName;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement cardNum;
	
	@FindBy(name = "cc_type")
	private WebElement cardType;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expYear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvvNum;
	
	@FindBy(name = "book_now")
	private WebElement bookNow;

	public WebElement getFrstName() {
		return frstName;
	}

	public WebElement getLstName() {
		return lstName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
}
