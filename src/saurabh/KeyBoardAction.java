package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

    public class KeyBoardAction {
	public static void main (String[]args) {
		
		WebDriver driver = Browser555.openBrowser("https://demoqa.com/text-box");
		WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
		userName.sendKeys("saurabh");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		
		actions.sendKeys("xyz@gail.com");
		
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("Indapur Aurangabd");

	    actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("a");
	    actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
	  
		actions.keyDown(Keys.TAB);

	    actions.keyDown(Keys.CONTROL);
	    actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
     	actions.build().perform();



	
	 
	
	
	}
	

}
