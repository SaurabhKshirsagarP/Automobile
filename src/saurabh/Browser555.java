 package saurabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser555 {

	
	   public static  WebDriver openBrowser(String url){
		
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
	    
		return driver;
}
	
}
