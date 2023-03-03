package com.ProjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static void url (WebDriver d, String url) {
		d.get(url);
	}
	public static void max(WebDriver d) {
		d.manage().window().maximize();
	}
	public static void title(WebDriver d) {
	String s=	d.getTitle();
	System.out.println(s);
	}
	public static void close_ex(WebDriver d) {
		d.close();
	}
	public static void quit_ex(WebDriver d) {
		d.quit();
	}
	public static void singleWindow(WebDriver d) {
		d.getWindowHandle();
		
	}
	public static void send(WebElement e,String s) {
		e.sendKeys(s);
	}
	public static void display(WebElement e) {
	Boolean b=	e.isDisplayed();
	System.out.println(b);
	}
	public static void txt(WebElement e) {
	String s=	e.getText();
	System.out.println(s);
	}
	public static void click_ex(WebElement e) {
		e.click();
	}
	
	//select methods
	//action
	//robot
	//js
	
	public static void select_ex(WebElement e) {
	Select s=new Select( e);
//	e.selectByVisibleText(("Baby Clothing & Accessories");
	
	
	}
	
	
	
	
	


}
