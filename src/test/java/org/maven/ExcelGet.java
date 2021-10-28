package org.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.pom.BookAHotel;
import org.pom.BookingConfirmation;
import org.pom.LoginPage;
import org.pom.SearchHotel;
import org.pom.SelectHotel;

public class ExcelGet {
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal lib = new LibGlobal();
		WebDriver driver = lib.lauchBrowser("chrome");
		lib.getUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		LoginPage loginPage = new LoginPage();
		lib.setText(loginPage.getUsrName(), lib.getDataFromExcel("Details", 1, 0));
		lib.setText(loginPage.getUsrPassWord(), lib.getDataFromExcel("Details", 1, 1));
		lib.clickBtn(loginPage.getLoginBtn());
		
		SearchHotel searchHotel = new SearchHotel();
		lib.selectByVisibleText(searchHotel.getLocation(), lib.getDataFromExcel("Details", 1, 2));
		lib.selectByValue(searchHotel.getHotels(), lib.getDataFromExcel("Details", 1, 3));
		lib.selectByVisibleText(searchHotel.getRoomType(), lib.getDataFromExcel("Details", 1, 4));
		lib.selectByValue(searchHotel.getNumOfRoom(), lib.getDataFromExcel("Details", 1, 5));
		lib.setText(searchHotel.getCheckInDate(), lib.getDataFromExcel("Details", 1, 6)); 
		lib.setText(searchHotel.getCheckOutDate(), lib.getDataFromExcel("Details", 1, 7)); 
		lib.selectByValue(searchHotel.getAdultsInRoom(), lib.getDataFromExcel("Details", 1, 8));
		lib.selectByValue(searchHotel.getChildInRoom(), lib.getDataFromExcel("Details", 1, 9));
		lib.clickBtn(searchHotel.getSearchBtn());
		
		SelectHotel selectHotel = new SelectHotel();
		lib.clickBtn(selectHotel.getRadioBtn());
		lib.clickBtn(selectHotel.getContinueBtn());

		BookAHotel bookHotel = new BookAHotel();
		lib.setText(bookHotel.getFrstName(), lib.getDataFromExcel("Details", 1, 10));
		lib.setText(bookHotel.getLstName(), lib.getDataFromExcel("Details", 1, 11));
		lib.setText(bookHotel.getAddress(), lib.getDataFromExcel("Details", 1, 12));
		lib.setText(bookHotel.getCardNum(), lib.getDataFromExcel("Details", 1, 13));
		lib.selectByVisibleText(bookHotel.getCardType(), lib.getDataFromExcel("Details", 1, 14));
		lib.selectByVisibleText(bookHotel.getExpMonth(), lib.getDataFromExcel("Details", 1, 15));
		lib.selectByVisibleText(bookHotel.getExpYear(), lib.getDataFromExcel("Details", 1, 16));
		lib.setText(bookHotel.getCvvNum(), lib.getDataFromExcel("Details", 1, 17));
		lib.clickBtn(bookHotel.getBookNow());
		
		Thread.sleep(6000);
		
		BookingConfirmation bookingConfo = new BookingConfirmation();
		lib.getAttributeByValue(bookingConfo.getOrderNum());
		
		
	}
}
