package com.frame;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
public class Demo {
	static WebDriver w;
	WebDriverWait  wt;
	public void url(String url) {
		w.get(url);
		
		
	}
	public void implicitWait() {
		// TODO Auto-generated method stub
		w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void visibilityof(WebElement e) {
		WebDriverWait  wt=new WebDriverWait(w,Duration.ofSeconds(0) );
		wt.until(ExpectedConditions.visibilityOf(e));
		
		// TODO Auto-generated method stub
	}
	
public void maximizeWindow() {
		// TODO Auto-generated method stub
		w.manage().window().maximize();
}
public void enterValueInTextBox(WebElement e, String s) {
	visibilityof(e);
    e.sendKeys(s);
}
public void btnClk(WebElement buttonElement) {
	visibilityof(buttonElement);
    buttonElement.click();
}
public void clkOkinAlert() {
	// TODO Auto-generated method stub
	Alert al=w.switchTo().alert();
	al.accept();

}
public void clkCancelinAlert() {
	// TODO Auto-generated method stub
	Alert al=w.switchTo().alert();
	al.dismiss();

}
public String etTxtfromWebpage(WebElement e) {
	// TODO Auto-generated method stub
	visibilityof(e);
String text = e.getText();
return text;
}
public String getInsertedValue(WebElement e, String attribute) {
	// TODO Auto-generated method stub
	visibilityof(e);
	String attribute2 = e.getAttribute(attribute);
return attribute2;
}
public void closeWnd() {
	// TODO Auto-generated method stub
w.close();
}
public void closeAllWnd() {
	// TODO Auto-generated method stub
w.quit();
}
public String getTitle() {
	// TODO Auto-generated method stub
String s=w.getTitle();
return s;
}
public static String getEnteredUrl() {
	// TODO Auto-generated method stub
String s=w.getCurrentUrl();
return s;
}
public void selectDropDownByVisibleTxt(WebElement e,String txt) {
	// TODO Auto-generated method stub
	visibilityof(e);
Select s=new Select(e);
s.selectByVisibleText(txt);
}
public void selectDropDownByAttribute(WebElement e,String attribute) {
	// TODO Auto-generated method stub
	visibilityof(e);
Select s=new Select(e);
s.selectByValue(attribute);
}
public void selectDropDownByIndex(WebElement e,int i) {
	// TODO Auto-generated method stub
	visibilityof(e);
Select s=new Select(e);
s.selectByIndex(i);
}
public Object insertValueUsingJS(WebElement element, String value) {
	visibilityof(element);
    JavascriptExecutor js = (JavascriptExecutor) w; 
    String script = "arguments[0].value = arguments[1]";
    Object obj = js.executeScript(script, element, value);
    return obj;
}
public void clkBtnUsingJs(WebElement e) {
	// TODO Auto-generated method stub
	visibilityof(e);
	 JavascriptExecutor js = (JavascriptExecutor) w; 
	 js.executeScript("arguments[0].click();", e);
}
public void launchChrmBrowser() {
	// TODO Auto-generated method stub
	
w=new ChromeDriver();
}
public void switchtochildwindow() {
	// TODO Auto-generated method stub
	String parent=w.getWindowHandle();
	Set<String> windows = w.getWindowHandles();
	Iterator<String>i=windows.iterator();
	while (i.hasNext()) {
		String child=i.next();
		if(!parent.equals(child)) {
		w.switchTo().window(child);		}
		}
	}
public void switchFrameById(String id) {
	// TODO Auto-generated method stub
w.switchTo().frame(id);
}
public void switchFrameByIndex(int i) {
	// TODO Auto-generated method stub
w.switchTo().frame(i);
}
public WebElement findLocatorByID(String id) {
	// TODO Auto-generated method stub
WebElement e=w.findElement(By.id(id));
return e;
}
public WebElement findLocatorByXPath(String xpath) {
    WebElement e = w.findElement(By.xpath(xpath));
    return e;
}
public WebElement findLocatorByName(String name) {
    WebElement e = w.findElement(By.name(name));
    return e;
}
public WebElement findLocatorByClassName(String className) {
    WebElement e = w.findElement(By.className(className));
    return e;}
public List<String> getAllOptionsFromDropDownAsText(WebElement e) {
    List<String> optionTexts = new ArrayList<String>();
    visibilityof(e);
    Select select = new Select(e);

    List<WebElement> options = select.getOptions();

    for (WebElement option : options) {
        optionTexts.add(option.getText());
    }

    return optionTexts;
}
public List<String> getAllOptionsFromDropDownAsAttributeValues(WebElement e, String attribute) {
    List<String> optionAttributeValues = new ArrayList<String>();
    visibilityof(e);
    Select select = new Select(e);

    List<WebElement> options = select.getOptions();

    for (WebElement option : options) {
        String attributeValue = option.getAttribute(attribute);
        optionAttributeValues.add(attributeValue);
    }

    return optionAttributeValues;
}

public List<String> getSelectedOptions(WebElement dropdown) {
    List<String> selectedOptions = new ArrayList<String>();
	visibilityof(dropdown);
    Select select = new Select(dropdown);

    List<WebElement> selectedElements = select.getAllSelectedOptions();

    for (WebElement selectedElement : selectedElements) {
        selectedOptions.add(selectedElement.getText());
    }

    return selectedOptions;
}



public boolean verifyDropDownIsMultiSelect(WebElement element) {
	visibilityof(element);
	Select select = new Select(element);
boolean multiple = select.isMultiple();
return multiple;
}



public boolean verifyIsDisplayed(WebElement element) {
	visibilityof(element);
	boolean b = element.isDisplayed();
	return b;
	}

public boolean verifyIsSelected(WebElement element) {
	visibilityof(element);
	boolean b = element.isSelected();
	
	return b;
	}


public boolean verifyIsEnabled(WebElement element) {
	visibilityof(element);
	boolean b = element.isEnabled();
	return b;
	}


public void deSelectByIndex(WebElement element,int index) {
	visibilityof(element);
	Select select = new Select(element);
	select.deselectByIndex(index);
}



public void deSelectByAttributeValue(WebElement element,String value) {
	visibilityof(element);
	Select select= new Select(element);
	select.deselectByValue(value);
	}


public void deSelectByText(WebElement element,String text) {
	visibilityof(element);
	Select select= new Select(element);
	select.deselectByVisibleText(text);
}


public void deSelectAll(WebElement element) {
	Select select= new Select(element);
	visibilityof(element);
	select.deselectAll();
}


public String getTheParentWindow() {
	String windowHandle = w.getWindowHandle();

	return windowHandle;
	}

public Set<String>getAllWindows() {
	Set<String> windowHandles = w.getWindowHandles();
	return windowHandles;

}

public void toPerformRightClick(WebElement e) {
	visibilityof(e);
	Actions a=new Actions(w);
	a.contextClick(e).perform();

}


public void toPerformDoubleClick(WebElement e) {
	 visibilityof(e);
 Actions	action= new Actions(w);
	action.doubleClick(e).perform();
	
}

public void insertvalueTextBoxAndPressEnter(WebElement element,String value) {
	element.sendKeys("value",Keys.ENTER);

}

public void refreshPage() {
	w.navigate().refresh();

}
public static void updateCellData(String sheetname, int rownum,int cellnum,String old,String neww ) throws Throwable {
	File f=new File("C:\\Users\\DELL\\eclipse-workspace\\FileOperations\\aravind\\test.xlsx");
	FileInputStream fis=new FileInputStream(f);
	
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheet=wb.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	String value=cell.getStringCellValue();
	if(value.equals(old)) {
		
		cell.setCellValue(neww);
		
	}
	FileOutputStream fos=new FileOutputStream(f);
     wb.write(fos);
	
	

}
}

	

