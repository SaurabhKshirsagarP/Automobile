package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser4 {
	public static void main (String[]args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
	
		WebElement password=driver.findElement(By.className("_xkt"));
		password.click();
		
	
	
	
	}		
}
