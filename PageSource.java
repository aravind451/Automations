package com.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w= new ChromeDriver();
		w.get("https://omrbranch.com/");
	// to know the  source of the page	System.out.println(w.getPageSource());
		WebElement e=w.findElement(By.cssSelector(".form-control"));
		e.sendKeys("auiai");
//		w.navigate().refresh();
		
		

	}

}
