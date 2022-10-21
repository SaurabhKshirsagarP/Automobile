package saurabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class crombrower {
public static void main (String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	//driver.get("https://vctcpune.com/");//help us open URL browser
 // Navigation nav = driver.navigate();//navigate method return Interface Navigation	
	//nav.to ("https://vctcpune.com/");//
	driver.navigate().to("https://vctcpune.com/");// will open URL
	
	Thread.sleep(2000);//it will stop Execution for the given time
	driver.navigate().back();//it will click on back button on browser
	
	Thread.sleep(2000);//it will stop Execution for the given time
	driver.navigate().forward();//it will click on Forward button on browser
	
	Thread.sleep(2000);//it will stop Execution for the given time
	driver.navigate().refresh();//it will click on Forward button on browser
	
	String title = driver.getCurrentUrl();//this method get the URL of current page
	System.out.println(title);


}
	
	
}
