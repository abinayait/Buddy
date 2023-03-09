package com.ProjectClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.makemytrip.Demo;
public class Cricketbuzz {

	static WebDriver driver;
	
	public static void matchList() throws IOException {
		ChromeOptions options=new ChromeOptions();
	//this method is deprecated in 4.8-	options.setHeadless(true);
		//options.addArguments("--headless=new");
		options.addArguments("--headless=chrome");
		//options.addArguments("headless");
	 driver=new ChromeDriver(options);
	driver.get("https://www.cricbuzz.com/cricket-series/5945/indian-premier-league-2023/matches");
	driver.manage().window().maximize();
	

List<	WebElement> all_date=driver.findElements(By.xpath("//div/span[text()='Date']/parent::div/following-sibling::div/div[1]/span"));

String bd="";
String tr="";


	for (WebElement date : all_date) {
	//	System.out.println(date.getText());
		String dt=date.getText();

		String 	match=driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[1]/../following-sibling::div//a")).getText();
		String link=driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[1]/../following-sibling::div//a")).getAttribute("href");
		
int a=80-match.length();
String match2="";
String link2="";

for(int i=0;i<a;i++) {
	match+=" ";
}
try {
	
match2="\n"+"\t\t"+driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[3]/../following-sibling::div//a")).getText();
link2="\n"+"\t\t"+driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[3]/../following-sibling::div//a")).getAttribute("href");

int b=80-match2.length();
for(int i=0;i<b;i++) {
	match2+=" ";
}
}
catch(NoSuchElementException e) {
	
}
		
String slot=driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[1]/../following-sibling::div//span[@class='schedule-date ng-isolate-scope']")).getText();
		
String slot2="";

try {
 slot2=driver.findElement(By.xpath("(//*[text()=\""+dt+"\"])[3]/../following-sibling::div//span[@class='schedule-date ng-isolate-scope']")).getText();

}
catch(NoSuchElementException e ) {
	
}
System.out.println(dt+"\t"+match+slot+link+match2+"   "+slot2+link2);

System.out.println();
		
		
		

tr+="<tr>"+"<td>"+dt+"</td>"+"<td>"+match+"<br>"+"\n"+match2+"</td>"+"<td>"+slot+"<br>"+""+slot2+"</td>"+"<td>"+link+"\n"+"<br>"+link2+"</td>"+"</tr>"+"\n";
//+"<td>"+match2+"</td>"+"<td>"+slot2+"</td>"
	}
bd="<table>"+"\n"+tr
+"</table>"+"\n";



String s="<html>"+"\n"
		+"<head>" +"hello world"+"\n"
		+"<body>"+"\n"+bd
		+"</body>"+"\n"
		+"</head>"+"\n"
		+ "</html>";

File f=new File("G:\\Learning\\Abinaya Git\\Medibuddy\\ProjectClass\\target\\ipl.html");
FileWriter fw=new FileWriter(f);

fw.write(s);
fw.close();
 
driver.findElement(By.xpath("")).click();

	}


public static void main(String[] args) throws IOException {
	
	try {
		
	matchList();
	}
	catch(Exception e) {
	Demo.screensnap("G:\\Learning\\Abinaya Git\\Medibuddy\\ProjectClass\\target",driver);
	}
}
	
public static void failure() {
	
/*
	WebElement schl=driver.findElement(By.xpath("//a[text()='Schedule']"));
	schl.click();
	WebElement all_match=driver.findElement(By.xpath("//a[text()='All Matches']"));
	all_match.click();
	List<WebElement> matchname=driver.findElements(By.xpath("//div[@id='all-list']/div[@class='cb-col-100 cb-col']/div/a"));
	for (WebElement all_mat : matchname) {
		System.out.println(all_mat.getText());
	}
	List<WebElement> time =driver.findElements(By.xpath("//div[@id='all-list']/div[@class='cb-col-100 cb-col']/div/div/div/span[@class='schedule-date ng-isolate-scope']"));
	for(WebElement all_time :time) {   
	System.out.println(all_time.getText());
	}
	Map <String,String> fulllist=new HashMap<String,String>();
	System.out.println(fulllist.put(driver.findElement(By.xpath("//div[@id='all-list']/div[@class='cb-col-100 cb-col']/div/a")).getText(),driver.findElement(By.xpath("//div[@id='all-list']/div[@class='cb-col-100 cb-col']/div/div/div/span[@class='schedule-date ng-isolate-scope']")).getText()));
	

	
	div/span[text()='Date']/parent::div/following-sibling::div/div[1]/span
 	List<WebElement> all_team=driver.findElements(By.xpath("//div/span[text()='Match Details']/parent::div/following-sibling::div//div/a/span"));
	for (WebElement team : all_team) {
		System.out.println(team.getText());
	}
	
	  List<WebElement> all_link=driver.findElements(By.
	  xpath("div/span[text()='Match Details']/parent::div/following-sibling::div//div/a"
	  )); for (WebElement link : all_link) { System.out.println("..");
	  System.out.println(link); System.out.println(".."); }
	 
	List<WebElement> all_time=driver.findElements(By.xpath("//div/span[text()='Match Details']/parent::div/following-sibling::div//div/span[@class='schedule-date ng-isolate-scope']"));
	for(WebElement time :all_time){
		System.out.println(time.getText());
	}
	
	String m="Lucknow Super Giants vs Royal Challengers Bangalore, 43rd Match";
	System.out.println(	m.length());
	
*/
}

}

	

