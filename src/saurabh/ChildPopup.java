 package saurabh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


public class ChildPopup 
{
	public static void switchToChildBrowser(String title, WebDriver driver)
	{
		  
			Set<String> handles =  driver.getWindowHandles();
			Iterator <String> i =  handles.iterator();
			
			while(i.hasNext())
				{
				String handle =i.next();
		        driver.switchTo().window(handle);
				String Actualtitle = driver .getTitle();
				
			if (Actualtitle.equals(title))
			{
			break;
			}
			    }
			
			
	}

}

