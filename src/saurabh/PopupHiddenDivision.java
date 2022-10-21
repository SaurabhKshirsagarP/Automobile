package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupHiddenDivision {
	public static void main (String[]args) throws InterruptedException {
	WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");

		WebElement popup = driver.findElement(By.xpath("//div[@class='popup']"));
	    popup.click();
	    Thread.sleep(3000);
      
	 
	  WebElement hiddenPopUP = driver.findElement(By.xpath("//span[@id='myPopup']"));
       hiddenPopUP.click();
	}
}
