package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame
{
	public static void main (String []args) throws InterruptedException
	{
	WebDriver driver = Browser555.openBrowser("https://vctcpune.com/");

    WebElement practice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
    practice.click();
	
	ChildPopup.switchToChildBrowser("Practice Page", driver);
	
	//driver.switchTo().frame("courses-iframe");// by use in id we witch window main window to another window (iframe)they are present in same page 
	driver.switchTo().frame(0) ;         
    //WebElement iframe =  driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
	//driver.switchTo().frame(iframe) ;         

	Thread.sleep(2000);
	
	WebElement courses = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
	courses.click();
	

	
	
	
	
	}
}