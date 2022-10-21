package saurabh;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {
	
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://vctcpune.com/");
	
		Dimension d =  new Dimension(1000,500);
		driver. manage().window().setSize(d);
		
		Point p = new Point(200,400);
		driver. manage().window().setPosition(p);

	}
	
	
	

}
