package saurabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {

	
		public static void  main (String[]args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();

			driver.navigate().to ("https://vctcpune.com/");
			
			Options op = driver.manage(); // by using manage method of web driver interface which return options Interface
		    Window win = op.window();// by using windows method of options interface which return window interface
			//win.maximize();
			
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);//it will stop Execution for the given time

			driver.manage().window().minimize();
			
			
			

		}
			
			

}

	

	
	
	
	

