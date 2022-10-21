package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser6    {
	
	public static void main(String[]args) {
	
		WebDriver driver = Browser555.openBrowser("https://www.facebook.com/login/");
	
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	
		email.sendKeys("xyx@gmail.com");
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("12345");
	
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	
	
	
	}

}
