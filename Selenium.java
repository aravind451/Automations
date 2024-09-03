package com.frame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.gherkin.Argument;

public class Selenium {
//public static void main(String[] args) throws AWTException {
//	WebDriver w= new ChromeDriver();
//	w.manage().window().maximize();
// w.get("https://www.amazon.in/");
// WebElement e=w.findElement(By.xpath("//INPUT[@placeholder='Search Amazon.in']"));
//e.sendKeys("iphone"); 
//Robot r= new Robot();
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_ENTER);
//WebElement ph=w.findElement(By.xpath("//span[ text()='iPhone 15 (128 GB) - Pink']"));
//JavascriptExecutor jse=(JavascriptExecutor)w;
//jse.executeScript("arguments[0].scrollIntoView(true)", ph);

	public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
      
        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the main window
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();
        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        Iterator<String>iter=windowHandles.iterator();
        System.out.println(iter);
        while(iter.hasNext()) {
        	String child=iter.next();
        	if(!mainwindow.equalsIgnoreCase(child)) {
        		driver.switchTo().window(child);
        		driver.manage().window().maximize();
        		
        		
        	}
        }
        // Perform an action that opens a new window (e.g., clicking a link)
//        WebElement openNewWindowLink = driver.findElement(By.linkText("Open New Window"));
//        openNewWindowLink.click();
//
//        // Get all window handles
//        Set<String> windowHandles = driver.getWindowHandles();
//
//        // Iterate over handles
//        for (String handle : windowHandles) {
//            // Switch to the new window
//            driver.switchTo().window(handle);
//
//            // Check if this is the desired window by performing some checks
//            if (driver.getTitle().equals("New Window Title")) {
//                // Perform actions in the new window
//                System.out.println("Switched to the new window: " + driver.getTitle());
//
//                // Close the new window
//                driver.close();
            }
        
        // Switch back to the main window
//        driver.switchTo().window((String) windowHandles.toArray()[0]);
//
//        // Close the main window or quit the entire session
//        driver.quit();
    }

















