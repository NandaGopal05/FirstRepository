package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	public static WebDriver driver;
	
	public WebDriver lauchBrowser(String browserName) {
		
		try {
			if (browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
				else if (browserName.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				else if (browserName.equals("ie")) {
					WebDriverManager.iedriver().setup();
					driver = new InternetExplorerDriver();
				}
				else {
						System.out.println("Invalid Browser");
			
				}	
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}
	
		public void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println("Invalid Browser");
		}	
		}
		public void setText(WebElement element, String data) {
			element.sendKeys(data);
		}
		public void clickBtn(WebElement e) {
			e.click();
		}
			
		public void selectByValue(WebElement element, String data) {
			Select s = new Select(element);
			s.selectByValue(data);
			}
		public void selectByVisibleText(WebElement element, String data) {
			Select s = new Select(element);
			s.selectByVisibleText(data);
		}
	
		public String getDataFromExcel(String sheet, int row, int cell) throws IOException {
			String value = null;
			try {
				File excelLoc = new File("C:\\Users\\Nanda\\eclipse-workspace\\Framework\\Excel\\ExcelGet.xlsx");
				FileInputStream fileInputStream = new FileInputStream(excelLoc);
				Workbook w = new XSSFWorkbook(fileInputStream);
				Sheet s = w.getSheet(sheet);
				Row r = s.getRow(row);
				Cell c = r.getCell(cell);
				
				int type = c.getCellType();
				if (type == 1) {
					value = c.getStringCellValue();
				}
				if (type == 0) {
					if(DateUtil.isCellDateFormatted(c)) {
					
					Date d = c.getDateCellValue();
					SimpleDateFormat simpl = new SimpleDateFormat("dd/mm/yyyy");
					value = simpl.format(d);
				}
					else {
						double d = c.getNumericCellValue();
						long l = (long)d;
						value = String.valueOf(l);
					}
			}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			return value;
		}
			
			public String getAttributeByValue(WebElement e) {
				System.out.println(e.getAttribute("value"));
				return null; 

				
			}
			
			public String printText(WebElement e) {
				String text = e.getText();
				return text;

			}
		
}
	


