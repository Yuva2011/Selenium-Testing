package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void windowMaximize() {
		
		driver.manage().window().maximize();	
	}

	public static void launchUrl(String url) {
		
		driver.get(url);
		
	}
	
	public static void pageTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public static void pageUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	}
	
	public static void passText(String txt, WebElement E) {
		
		E.sendKeys(txt);
		
	}
	
	public static void clickBtn(WebElement E) {
		E.click();
	}
	
	public static void closeEntireBrowser() {
		
		driver.quit();
		
	}
	
	public static void screenShot(String imgName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
		File b = ts.getScreenshotAs(OutputType.FILE);
		File c = new File("location+ imgName.png");
		FileUtils.copyFile(b,c);
		
	}
	
	public static  Actions b;
	
	public static void moveTheCursor(WebElement target) {
		b = new Actions(driver);
		b.moveToElement(target).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		b = new Actions(driver);
		b.dragAndDrop(dragWebElement, dropElement);
	}
	
	public static JavascriptExecutor js;
	
	public static void scrollTrue(WebElement targetElement1) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", targetElement1);
	}
	
	public static void scrollFalse(WebElement targetElement2) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", targetElement2);
	}
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("sheetName");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		
		String value = " ";
		if (cellType==1) {
			String value2 = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value1 = s.format(dd);
			}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			String valueOf = String.valueOf(l);
		}
	}
	public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
		File f = new File("C:\\Users\\Yuvi\\eclipse-workspace\\MavenInstallation\\excel\\Data.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet NS = wb.createSheet("data");
		Row r = NS.createRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}
	public static void createCell(int getRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\\\Users\\\\Yuvi\\\\eclipse-workspace\\\\MavenInstallation\\\\excel\\\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("data");
		Row r = s.getRow(getRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\\\Users\\\\Yuvi\\\\eclipse-workspace\\\\MavenInstallation\\\\excel\\\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("data");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
	}
	public static void updateToParticularCell(int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("data");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}
