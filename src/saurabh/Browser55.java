package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser55 {
	
	public static void main (String []args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		//WebElement forgot = driver.findElement(By.linkText("Forgotten account?"));
		//forgot.click();//link text
		
		WebElement forgot =driver.findElement(By.partialLinkText("Forgotten"));
	    forgot.click();// we can search partial text value
	
	}
}
