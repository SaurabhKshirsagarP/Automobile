package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BataPaymentPage 
{
	
	WebDriver driver;
	@Test 
public void BataPaymentPageTest() 
{
	 driver = Browser555.openBrowser("https://www.bata.in/login");
	WebElement login = driver.findElement(By.xpath("//button[@type='button']"));
	login.click() ; 
	BataPayment bataPayment = new BataPayment(driver);
	bataPayment.enterEmail("Saurah@gmail.com");
	
	
	
	
}
}
