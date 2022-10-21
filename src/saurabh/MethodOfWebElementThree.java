package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodOfWebElementThree {
	public static void main (String[]args) {
	WebDriver driver =	Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
	
 WebElement heading  = driver.findElement(By.xpath("//h1[contains(@class,'header1')]"));
 
 String pageHead =  heading.getText();	
 System.out.println(pageHead);
	
	WebElement head = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	
	String s =head.getText();
	System.out.println(s);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	}

}
