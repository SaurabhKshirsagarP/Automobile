package saurabh;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popupchild1 {
	public static void main (String []args) throws Exception {
    WebDriver driver = Browser555.openBrowser("https://vctcpune.com/");
	WebElement practice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	practice.click();
	 
	Set<String> handles = driver.getWindowHandles();
	Iterator <String> i =  handles.iterator();
	System.out.println(handles);
	while(i.hasNext())
		{
		String handle =i.next();
		driver.switchTo().window(handle);
        String Actualtitle = driver .getTitle();

	if (Actualtitle.equals("Practice Page"))
	{
     	WebElement radio = driver.findElement(By.xpath("//input[@value='Radio4']"));
		radio.click();
	ScreenShotMain.takeScreenShot(driver, "jay");
	}
	    }
	
	
	}

}
