package com.makemytrip;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Demo {
static 	WebDriver driver;
	public static void screensnap(String path, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("G:\\Learning\\Abinaya Git\\Medibuddy\\ProjectClass\\target\\failedscreenshot.png"));
		FileUtils.copyFile(src,new File(path+"\\failedscreenshot.png"));
		}
public static void main(String [] args) throws InterruptedException, AWTException, IOException {
	try {
		
	browserlaunch();
	}
	catch(Exception e) {
		
		screensnap("G:\\Learning\\Abinaya Git\\Medibuddy\\ProjectClass\\target",driver);
		e.printStackTrace();
		
	}
	finally {
		driver.close();
	}
}
	
	public static void browserlaunch()throws InterruptedException, AWTException {
		
		 driver=new ChromeDriver();
	
		driver.manage().window().maximize();

		driver.get("https://www.medibuddy.in/");
		Thread.sleep(5000);

driver.findElement(By.xpath("//a//div[text()='More']")).click();
		
		
	}
	public static void practise() {
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.makemytrip.com/");
	/*	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Medicine']/ancestor::*[@href='https://www.medibuddy.in/Medicine/']")));
		driver.manage().timeouts().implicitlyWait(null)
		*/
		
//		Thread.sleep(5000);
//		WebElement  medicine=driver.findElement(By.xpath("//h1[text()='Medicine']/ancestor::*[@href='https://www.medibuddy.in/Medicine/']"));
//		medicine.click();
//		
//		
//		
//		Actions a=new Actions(driver);
//		Thread.sleep(5000);
		
//		WebElement close=driver.findElement(By.xpath("//span[.='close']"));
//		close.click();
		
		
	
/*
 * a.moveToElement(driver.findElement(By.xpath(
 * "//input[@type='text']/parent::*[@class='input-wrapper']"))).click().build().
 * perform(); a.sendKeys("631502").build().perform(); Robot r=new Robot();
 * r.keyPress(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_DOWN);
 * r.keyPress(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_DOWN);
 * r.keyRelease(KeyEvent.VK_DOWN);
 * 
 * 
 * 
 * // JavascriptExecutor js=(JavascriptExecutor)driver; WebElement
 * prescription=driver.findElement(By.
 * xpath("//button[@type='button']/span[.='Order via Prescription']"));
 * prescription.click();
 * 
 * Thread.sleep(2000); WebElement
 * upload=driver.findElement(By.xpath("//p[.='Upload Prescription']"));
 * upload.click();
 */
     
 //    upload.sendKeys("G:\\Learning\\Order prescription list.docx");
 //    File order=new File("G:\\Learning\\Order prescription list.docx");
     
     
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
		
		//condition:anonymous class pageload method
		/*		
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) {

			return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");}
		};
			WebDriverWait page=new WebDriverWait(driver,Duration.ofSeconds(10));
		page.until(pageLoadCondition);
		
		*/
		
		
	}

}
