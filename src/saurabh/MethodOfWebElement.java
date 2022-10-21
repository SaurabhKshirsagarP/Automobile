package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodOfWebElement {
	public static void  main (String []args) {
	WebDriver driver =	Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio"+2+"']"));
    radio1.click();
	System.out.println(radio1.isSelected());
	
	 WebElement option1 = driver.findElement(By.xpath("//input[@value='option"+3+"']"));
	 option1.click();
	 System.out.println(option1.isSelected());
	 
	 WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
	 option2.click();
     System.out.println(option2.isSelected());
	 
	}

}
