package com.makemytrip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args)throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.medibuddy.in/");
//	WebDriverWait wait=new WebDriverWait(driver,3);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Medicine']/ancestor::*[@href='https://www.medibuddy.in/Medicine/']")));
		Thread.sleep(5000);
		WebElement  medicine=driver.findElement(By.xpath("//h1[text()='Medicine']/ancestor::*[@href='https://www.medibuddy.in/Medicine/']"));
		medicine.click();
		
		
		
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		
//		WebElement close=driver.findElement(By.xpath("//span[.='close']"));
//		close.click();
		
		
	
		a.moveToElement(driver.findElement(By.xpath("//input[@type='text']/parent::*[@class='input-wrapper']"))).click().build().perform();
     a.sendKeys("631502").build().perform();
     Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

		
//     JavascriptExecutor js=(JavascriptExecutor)driver;
     WebElement prescription=driver.findElement(By.xpath("//button[@type='button']/span[.='Order via Prescription']"));
     prescription.click();
     
     Thread.sleep(2000);
     WebElement upload=driver.findElement(By.xpath("//p[.='Upload Prescription']"));
     upload.click();
     
//     js.executeScript("arguments[0].click()", prescription);

     
		//	WebElement upload=	driver.findElement(By.xpath("//p[.='Upload Prescription']"));
		//		upload.click();




//System.out.println("..");	
//Thread.sleep(6000);
//driver.quit();

/*		Alert a=driver.switchTo().alert();
	WebElement pincode=driver.findElement(By.xpath("//input[@type='text']/parent::*[@class='input-wrapper']"));
		a.sendKeys("631502");
	
		/*			
		
		System.out.println("..");
		
		
		
		
*/
//		driver.switchTo().window()
		
		
	}

}
