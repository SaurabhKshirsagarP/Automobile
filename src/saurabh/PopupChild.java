package saurabh;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class PopupChild {
	public static void main (String[]args) {
		WebDriver driver =Browser555.openBrowser("https://vctcpune.com/");
      	WebElement practice= driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
        practice.click();
            
         String Handle   = driver.getWindowHandle();	
	     System.out.println("main"+Handle);
               
	     Set<String> handles = driver.getWindowHandles();
         Iterator <String> i = handles.iterator();
	     System.out.println( i.next());
	     System.out.println( i.next());

}

}
