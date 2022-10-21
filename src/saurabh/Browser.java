package saurabh;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

		public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\velocity\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://vctcpune.com/");// will open URL

		Thread.sleep(2000);//it will stop Execution for the given time
		
		String title = driver.getTitle();// method of webdriver give the title of webpage
		System.out.println(title);
		
		Thread.sleep(2000);//it will stop Execution for the given time

		String url = driver.getCurrentUrl();//this method get the URL of current page
		System.out.println(url);

		driver.close(); 
		
		
		
	}
		
		
	}



