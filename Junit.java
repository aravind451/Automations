package com.frame;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Junit extends Demo {
	WebDriver d= new ChromeDriver();
@Before 
public void login(){
	
	
	w.get("https://www.airindia.com/");
	String s=getEnteredUrl();
	System.out.println(s);
}@BeforeClass

private void intialize() {
	// TODO Auto-generated method stub

}
@Test
@OrderWith(1)

 
}
