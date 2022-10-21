package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriopDown {
	public static void main(String[]args) {
		WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(DropDown);
		//s.selectByVisibleText("Option3");
	//	s.selectByValue("Option2");
		s.selectByIndex(3);
	}

}