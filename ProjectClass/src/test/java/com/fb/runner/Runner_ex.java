package com.fb.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ProjectClass.Base_Class;
import com.ProjectClass.Login_Page;

public class Runner_ex extends Base_Class {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	url(driver,"https://www.facebook.com");
	max(driver);
	
	Login_Page login=new Login_Page(driver);
	send(login.getLogin(), "xyz.gamil.com");
	send(login.getPassword(),"uyqtr92");
	click_ex(login.getButton());
	System.out.println("...");

	
	
	
	}

}
