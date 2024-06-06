package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor js;
	public static TakesScreenshot ts;
	public static Alert a1;
	
	//chrome driver config
	public static void driverConf() {
		driver = new ChromeDriver();
	}
	
	//lauch browser
	public static void browserLaunch(String url) {
		driver.get(url);
	}
	
	// max window
	public static void maxWindow() {
       driver.manage().window().maximize();
	}
	
	//fill text box using sendkeys
	public static void fillTxt(WebElement text, String value) {
		text.sendKeys(value);
	}
	
	public static void close() {
		driver.close();

	}
	
	//click method
	public static void click(WebElement element) {
       element.click();
	}
	
	//title
	public static void title() {
		String text = driver.getTitle();
		System.out.println(text);

	}
	
	//action methods
	public static void action(WebElement target) {
       a = new Actions(driver);
       a.moveToElement(target);
	}
	
	//javascripExcecutor
	public static void javaScript(String script, WebElement args) {
       js = (JavascriptExecutor)driver;
       js.executeScript(script, args);
	}
	
	//takescreenshot
	public static void screenShot(String location) throws IOException {
		
       ts = (TakesScreenshot)driver;
       File target = ts.getScreenshotAs(OutputType.FILE);
       
       File dest = new File(location);
       
       FileUtils.copyFile(target, dest);  
	}
	
	//waits thread.sleep
	public static void time(long sleep) throws InterruptedException {
       Thread.sleep(sleep);
	}
	
	// implicits waits
	public static void implicit(long duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	//locators
	public static WebElement byId(String id) {
		WebElement element = driver.findElement(By.id(id));
        return element;
	}
	
	//frame
	public static void frame(WebElement element) {
       driver.switchTo().frame(element);
	}
	
	//frame with id
	public static void frameId(String id) {
       driver.switchTo().frame(id);
	}
	
	//frame with index
	public static void frameIndex(int indexpos) {
		driver.switchTo().frame(indexpos);
	}
	
	//alert
	public static void alert() {
       a1 = driver.switchTo().alert();
	}
	
	public static void alertmethods() {
       a1.accept();
	}

	// Excel read
	public static String excelRead(String location, String sheetName, int rowNo, int cellNo) throws IOException {
		
		//loctaion
		File f = new File(location);
		//read file
		FileInputStream fis = new FileInputStream(f);
		//format
		Workbook w = new XSSFWorkbook(fis);
		//get sheet
		Sheet s = w.getSheet(sheetName);
		//get row
		Row r = s.getRow(rowNo);
		//get cell
		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		
		String value ="";
		

		if (cellType == 1) { // to get only the string value
			 value = c.getStringCellValue();
			//System.out.println(value);	
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date date = c.getDateCellValue();
			SimpleDateFormat si = new SimpleDateFormat("DD/MM/YYYY");
			value = si.format(date);
			//System.out.println(value);
		}
		else {
			double numeric = c.getNumericCellValue();
			long l = (long)numeric;
			value = String.valueOf(l);
			//System.out.println(value);
		}
		
		return value;		
}
	public static void totalNoOfRowAndCell(String location,String sheetName) throws IOException {
		//loctaion
		File f = new File(location);
		//read file
		FileInputStream fis = new FileInputStream(f);
		//format
		Workbook w = new XSSFWorkbook(fis);
		//get sheet
		Sheet s = w.getSheet(sheetName);
		//get all row
		Row row = s.getRow(0);
		//get all rows
		int numberOfRows = s.getPhysicalNumberOfRows();
		//get all cells
		int NumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(numberOfRows);
		System.out.println(NumberOfCells);

	}
	
	public static void printAllRowAndCell(String location,String sheetName) throws IOException {
		
		File f = new File(location);
		// read file
		FileInputStream fis = new FileInputStream(f);
		//file format
		Workbook w = new XSSFWorkbook(fis);
		//get sheet
		Sheet sheet = w.getSheet(sheetName);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
		
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.print(" "+cell);
			}
			System.out.println("\n");
			
		  }
	}
	
	public static Select s ;
	
	public static void selectByIndex(WebElement webElement,int indexPos) {
	    s = new Select(webElement);
		s.selectByIndex(indexPos);
	}
	
	public static void selectByValue(WebElement webElement,String value) {
        s= new Select(webElement);
        s.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement webElement,String text) {
		s = new Select(webElement);
		s.selectByVisibleText(text);

	}
	public static void dateTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
}







/*method names
 * 
 * driverConf()-------------------------------->browser configuration chrome browser
 * browserLaunch(String url)-------------------> launch url
 * maxWindow() --------------------------------> maximize window
 * fillTxt(WebElement text, String value)------>sendkey method to fill textbox
 * click(WebElement element)------------------->click() web element
 * title() ------------------------------------> get title of the web page
 * action(WebElement target)------------------->action methods
 * javaScript(String script, WebElement args)-->javascript concepts setattribute, click, return getattribute, scrollintoview
 * screenShot(String location)----------------->takesscreenshot method
 * time(long sleep)---------------------------->thread.sleep() method (unconditional wait)
 * implicit(long duration)--------------------->implicit waits(polling time 250 ms and it is conditional waits)
 * frame(WebElement element)------------------->switch to frame using web element
 * frameId(String id)-------------------------->switch to frame using id
 * frameIndex(int indexpos)-------------------->switch to frame using index position
 * alert()------------------------------------->switch to alert
 * alertmethods()------------------------------>accept method in alert
 * String excelRead(String location, String sheetName,int r, int c)--->read excel file data
 * printAllRowAndCell(String location,String sheetName)  -----> to print tital number of row and cells
 * printAllRowAndCell(String location,String sheetName -------> print all row and cell data
 * selectByIndex(WebElement webElement,int indexPos)=---------> dropdown select by index
 * selectByValue(WebElement webElement,String value)----------> dropdown select by value
 * selectByVisibleText(WebElement webElement,String text) ----> drop down select by visible text
 * 
 * 
 * */
