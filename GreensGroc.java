package com.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreensGroc extends Demo {
	
	public static void main(String[] args) throws Throwable {
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\FileOperations\\aravind\\test.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		  Row row = sheet.createRow(1);
		  System.out.println(row.getCell(1));
		  updateCellData("Sheet1", 1, 1, "2021", "2022");
		WebDriver w=new ChromeDriver();
		w.get("https://omrbranch.com/");
		String pageSource = w.getPageSource();
		System.out.println(pageSource);
		w.manage().window().maximize();
		WebElement email=w.findElement(By.id("email"));
		email.sendKeys("aravind928451@gmail.com");
		WebElement pass=w.findElement(By.id("pass"));
		pass.sendKeys("Greens@123");
		WebElement loginBtn=w.findElement(By.xpath("//*[@id=\"userLogin\"]/div[5]/button"));
		loginBtn.click();
		w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchBox=w.findElement(By.id("search"));
		searchBox.sendKeys("nuts");
		WebElement searchBtn=w.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[6]/form/button"));
		searchBtn.click();
		w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Seartxt=w.findElement(By.xpath("//h5[@class='sectionTitle font35 font-weight-bold color11']"));
		String text1 = Seartxt.getText();
		System.out.println(text1);
		WebElement addbtn=w.findElement(By.xpath("//a[@class=\"hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-19\"]"));
	   addbtn.click();
	   
	  WebElement addbtn2=w.findElement(By.id("cart-25"));
	  WebDriverWait  wt=new WebDriverWait(w,Duration.ofSeconds(3) );
		wt.until(ExpectedConditions.visibilityOf(addbtn2));
	  addbtn2.click();
	  WebElement e3=w.findElement(By.xpath("//a[text()=\" Go To Cart \"]"));
	  JavascriptExecutor js= (JavascriptExecutor)w;
	  js.executeScript("arguments[0].click();",e3 );
	  //WebDriverWait  wt1=new WebDriverWait(w,Duration.ofSeconds(3) );
	//  wt.until(ExpectedConditions.visibilityOf(e3))
	  WebElement name=w.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div/div/div[2]/div/ul/li[2]/a"));
	  String textName= name.getText();
	  System.out.println(textName);
	  WebElement pmt=w.findElement(By.id("payment_type"));
	  
	  Select s=new Select(pmt);
	  s.selectByIndex(1);
	  WebElement visa=w.findElement(By.id("visa_card"));
	  js.executeScript("arguments[0].click()", visa);
	  
	  WebElement cardno=w.findElement(By.name("card_no"));
	  cardno.sendKeys("5555555555552222");
	  WebElement month=w.findElement(By.id("month"));
	  Select s2=new Select(month);
	  s2.selectByValue("February");
	  WebElement year=w.findElement(By.id("year"));
	  Select s3=new Select(year);
	  s3.selectByValue("2024");
	  WebElement cvv=w.findElement(By.name("cvv"));
	  cvv.sendKeys("2344");
	  WebElement plcOrder=w.findElement(By.id("placeOrder"));
	  plcOrder.click();
	  Thread.sleep(2000);
	  WebElement last= w.findElement(By.xpath("/html/body/div[4]/section/section[1]/div/div[1]/div[1]/p[1]/span"));
	  String latext = last.getText();
	  System.out.println(latext);
	
	}

}
