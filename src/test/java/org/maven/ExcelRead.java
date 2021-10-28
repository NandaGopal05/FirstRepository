package org.maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {
	public static void main(String[] args) throws IOException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone",Keys.ENTER);
		
		List<WebElement> iphoneTxt = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			
		File excelLoc = new File("C:\\Users\\Nanda\\eclipse-workspace\\Framework\\Excel\\Amazon_Task.xlsx");
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Iphone");
		
		for (int i = 0; i < iphoneTxt.size(); i++) {
			WebElement element = iphoneTxt.get(i);
			String text = element.getText();
			System.out.println(text);

			Row r = s.createRow(i);
		
			Cell c = r.createCell(0);
			
			c.setCellValue(text);
		
		}
		
		FileOutputStream outputStream = new FileOutputStream(excelLoc);
		w.write(outputStream);
	}

}
