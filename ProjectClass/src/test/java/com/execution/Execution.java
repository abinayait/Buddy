package com.execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ProjectClass.Base_Class;

public class Execution extends Base_Class{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		url(driver,"https://www.gmail.com");
		max(driver);
		title(driver);
		WebElement e=driver.findElement(By.xpath("//input[@type='email']"));
		send(e,"xyz@gmail.com");
		WebElement accnt=driver.findElement(By.xpath("//span[.='Create account']"));          
		display(accnt);
//		WebElement learnmore=driver.findElement(By.xpath("//div[@class='vwtvsf']/div[@class='PrDSKc']"));
//		txt(learnmore);
		WebElement forgot=driver.findElement(By.xpath("//button[text()='Forgot email?']"));
		click_ex(forgot);
		url(driver,"https://www.amazon.com");
		WebElement shop=driver.findElement(By.xpath("//a[.='Shop great deals now']"));
		shop.click();
		WebElement baby=driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::*[text()='Baby Clothing & Accessories']"));
		select_ex(baby);
		//	display()
	//	close_ex(driver);
		
		
		
	

	
	}

	
}
