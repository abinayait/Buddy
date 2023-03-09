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
/* git commands
 
 
delluser@LAPTOP-6N2GONVC MINGW64 ~
$ git status
fatal: not a git repository (or any of the parent directories): .git

delluser@LAPTOP-6N2GONVC MINGW64 ~
$ cd G:/Learning/Abinaya Git/Medibuddy
bash: cd: too many arguments

delluser@LAPTOP-6N2GONVC MINGW64 ~
$ cd "G:/Learning/Abinaya Git/Medibuddy"

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    ProjectClass/src/test/java/com/makemytrip/Demo.java -> ProjectClass/src/main/java/com/makemytrip/Demo.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java
        modified:   ProjectClass/src/main/java/com/makemytrip/Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ color
bash: color: command not found

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ color--
bash: color--: command not found

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ color --help
bash: color: command not found

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ cd

delluser@LAPTOP-6N2GONVC MINGW64 ~
$ color --help
bash: color: command not found

delluser@LAPTOP-6N2GONVC MINGW64 ~
$ git status
fatal: not a git repository (or any of the parent directories): .git

delluser@LAPTOP-6N2GONVC MINGW64 ~
$ cd "G:/Learning/Abinaya Git/Medibuddy"

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    ProjectClass/src/test/java/com/makemytrip/Demo.java -> ProjectClass/src/main/java/com/makemytrip/Demo.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java
        modified:   ProjectClass/src/main/java/com/makemytrip/Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git restore

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git restore   ProjectClass/src/main/java/com/ProjectClass/Class_A.java
error: pathspec 'ProjectClass/src/main/java/com/ProjectClass/Class_A.java' did not match any file(s) known to git

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git restore   ProjectClass/src/main/java/com/ProjectClass/Class_A.java
error: pathspec 'ProjectClass/src/main/java/com/ProjectClass/Class_A.java' did not match any file(s) known to git

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git restore ProjectClass/src/main/java/com/ProjectClass/Class_A.java
error: pathspec 'ProjectClass/src/main/java/com/ProjectClass/Class_A.java' did not match any file(s) known to git

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        renamed:    ProjectClass/src/test/java/com/makemytrip/Demo.java -> ProjectClass/src/main/java/com/makemytrip/Demo.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java
        modified:   ProjectClass/src/main/java/com/makemytrip/Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git add

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git add ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java
        renamed:    ProjectClass/src/test/java/com/makemytrip/Demo.java -> ProjectClass/src/main/java/com/makemytrip/Demo.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   ProjectClass/src/main/java/com/makemytrip/Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status ProjectClass/src/main/java/com/makemytrip/Demo.java
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   ProjectClass/src/main/java/com/makemytrip/Demo.java

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   ProjectClass/src/main/java/com/makemytrip/Demo.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git add ProjectClass/src/main/java/com/makemytrip/Demo.java

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   ProjectClass/src/main/java/com/ProjectClass/Cricketbuzz.java
        renamed:    ProjectClass/src/test/java/com/makemytrip/Demo.java -> ProjectClass/src/main/java/com/makemytrip/Demo.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java


delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git commit -m "crickbuzz screenshot"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'delluser@LAPTOP-6N2GONVC.(none)')

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git cofig --global user.name "abinaya"
git: 'cofig' is not a git command. See 'git --help'.

The most similar command is
        config

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git config --global user.name "abinaya"

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git commit -m "crickbuzz screenshot"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'delluser@LAPTOP-6N2GONVC.(none)')

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git config --global user.email "abinayavidhya315@gmail.com"

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git config --global user.name "abinaya"

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git commit -m "crickbuzz screenshot"
[excel 7b23bce] crickbuzz screenshot
 2 files changed, 114 insertions(+), 47 deletions(-)
 rename ProjectClass/src/{test => main}/java/com/makemytrip/Demo.java (91%)

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git push origin excel
Enter passphrase for key '/c/Users/delluser/.ssh/id_rsa':
git@github.com: Permission denied (publickey).
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git push origin excel
Enter passphrase for key '/c/Users/delluser/.ssh/id_rsa':
Enter passphrase for key '/c/Users/delluser/.ssh/id_rsa':
Enter passphrase for key '/c/Users/delluser/.ssh/id_rsa':
Received disconnect from 20.207.73.82 port 22:11: Bye Bye
Disconnected from 20.207.73.82 port 22
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git config --add --local core.sshCommand 'ssh -i C:/Users/delluser/.ssh/id_rsa_abinaya'

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git push origin excel
Enumerating objects: 25, done.
Counting objects: 100% (25/25), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (14/14), 3.02 KiB | 619.00 KiB/s, done.
Total 14 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
To github.com:abinayait/Buddy.git
   10081c6..7b23bce  excel -> excel

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$ git status
On branch excel
Your branch is up to date with 'origin/excel'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        ProjectClass/src/main/java/com/Project/
        ProjectClass/src/main/java/com/ProjectClass/Class_A.java

nothing added to commit but untracked files present (use "git add" to track)

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$

delluser@LAPTOP-6N2GONVC MINGW64 /g/Learning/Abinaya Git/Medibuddy (excel)
$

 
 */
}

	

