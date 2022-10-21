package saurabh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class findElements1 {
	 {
	  WebDriver driver = Browser555.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

	  WebElement  iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	  driver.switchTo().frame(iframe);
	  List<WebElement> image =driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));


	  WebElement trash  = driver.findElement(By.xpath("//div[@id='trash']"));

	  Actions actions = new Actions(driver);
	  int i =image.size();
	  System.out.println(i);
	  for (int j=0;j<i;j++) {
	  actions.dragAndDrop (image.get(j),trash);
	  actions.perform();
	  }
	  
	 }
}
