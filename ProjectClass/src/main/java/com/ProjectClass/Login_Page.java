package com.ProjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement button;

	
	public WebElement getButton() {
		return button;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
