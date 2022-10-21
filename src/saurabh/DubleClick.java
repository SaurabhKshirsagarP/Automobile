package saurabh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DubleClick {
	
	public static void main (String[]args) {
		WebDriver driver = Browser555.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement DClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions actions =new Actions(driver);
	    actions.doubleClick(DClick);
	    actions.build().perform();
	    
     	Alert a =driver.switchTo().alert();
      	a.accept();
	
	
	}

}
