package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyBoardActionP {
	public static void main (String[]args) {

		WebDriver driver = Browser555.openBrowser("https://www.facebook.com/signup");
		WebElement signup = driver.findElement(By.xpath("//input[@name='firstname']"));
		signup.sendKeys("saurabh");
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("Kshirsagar");
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("7773932932");
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("Saurabh@77");

	    actions.sendKeys(Keys.ARROW_DOWN);
	    actions.sendKeys("27");
	
	    actions.sendKeys(Keys.TAB);
	    actions.sendKeys("05");
	
	    actions.sendKeys(Keys.TAB);
	    actions.sendKeys("1997");
	
	   actions.build().perform();
	}
}