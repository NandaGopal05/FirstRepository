package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		LibGlobal lib = new LibGlobal();
		
		WebDriver driver = lib.lauchBrowser("chrome");
		driver.manage().window().maximize();
		lib.getUrl("https://adactinhotelapp.com/");
		
		WebElement usrName = driver.findElement(By.name("username"));
		lib.setText(usrName, "Nanda123");
		
		WebElement usrPass = driver.findElement(By.name("password"));
		lib.setText(usrPass, "PPC70N");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		lib.clickBtn(loginBtn);
		
		WebElement loc = driver.findElement(By.name("location"));
		lib.selectByValue(loc, "Sydney");
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		lib.selectByValue(hotel, "Hotel Creek");
		
		WebElement room = driver.findElement(By.name("room_type"));
		lib.selectByValue(room, "Super Deluxe");
		
		WebElement numOfRoom = driver.findElement(By.name("room_nos"));
		lib.selectByValue(numOfRoom, "2");
		
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		lib.setText(checkIn, "12/10/2021");
		
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		lib.setText(checkOut, "13/10/2021");
		
		WebElement adults = driver.findElement(By.name("adult_room"));
		lib.selectByValue(adults, "4");
		
		WebElement child = driver.findElement(By.name("child_room"));
		lib.selectByValue(child, "1");
		
		WebElement searchBtn = driver.findElement(By.name("Submit"));
		lib.clickBtn(searchBtn);
		
		WebElement radioBtn = driver.findElement(By.name("radiobutton_0"));
		lib.clickBtn(radioBtn);
		
		WebElement continueBtn = driver.findElement(By.name("continue"));
		lib.clickBtn(continueBtn);
	
	}
	

}
