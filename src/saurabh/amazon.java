package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazon {

public static void main (String []args) 
{
	WebDriver driver = Browser555.openBrowser("https://www.amazon.in/");
	WebElement wel =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
 wel.sendKeys("laptop");
	WebElement r =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

 r.click();
}
}
