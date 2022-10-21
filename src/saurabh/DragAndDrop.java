package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
  public static void main(String[]args) throws InterruptedException {
	 WebDriver driver = Browser555.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	 WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
     driver.switchTo().frame(iframe);
	 
	 WebElement source = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
	 
	 WebElement target = driver. findElement(By.xpath("//div[@id='trash']"));
	 Actions actions =new Actions(driver);
	 
	 for(int j=0;j<=4;j++)
	 {	 
	 actions.dragAndDrop(source, target);
	 }
	 Thread.sleep(4000);
	 actions.perform();
	 
  
  }

}
