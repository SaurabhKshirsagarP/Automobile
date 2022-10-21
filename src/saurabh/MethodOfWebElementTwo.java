package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodOfWebElementTwo {
public static void main (String[]args) throws InterruptedException {
	WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement text = driver.findElement(By.xpath("//input[@id='displayed-text']"));
    text.sendKeys("welcome everyone");/// by use in send key we can enter value in text box
    boolean result = text.isDisplayed();
    System.out.println(result);
	
    
    
    Thread.sleep(2000);
    text.clear();// by use in clear we can  clear  text
    
    Thread.sleep(2000);

    
   WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
   hide.click();
   System.out.println(hide.isDisplayed());
	
}
}
