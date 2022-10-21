package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser5 {
	
	public static void main (String []args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("Xyx@gmail.com");
	
	    WebElement password = driver.findElement(By.cssSelector("input[name='pass']"));
     	password.sendKeys("12345");
	
	    WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
	    login.click();
	

	}

}
