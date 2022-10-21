package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Zensor 
{
	public static void main(String[]args) {
		WebDriver driver =Browser555.openBrowser("https://www.zensar.com/insights");
	//    WebElement  read =driver.findElement(By.xpath("//span[@class='Button-wrap']"));
	//	read.click();
		
		
		
		
		
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='country']"));
		
		
		Select s = new  Select(DropDown);
		s.deselectByVisibleText("india");
          s.deselectByIndex(5)		;
	}
	
	

}
