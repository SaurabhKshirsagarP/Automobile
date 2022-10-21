package saurabh;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class veocityTest {
	
	@Test
	public void  DropDown() throws Exception {
		WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		velocityPractice velocity = new velocityPractice(driver);
		velocity.SelectDropDown();
		
	}

}
