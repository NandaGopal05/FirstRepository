package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
	static WebDriver driver;
	
	
		@BeforeClass
		private void LaunchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
		}
			
		
			
		@Test
			private void tc1() {
			WebElement element = driver.findElement(By.cssSelector("#email"));
			element.sendKeys("Nanda");
		
		}

	}


	
	


