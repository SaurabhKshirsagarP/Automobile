package saurabh;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser7 {
	public static void main(String[]args) throws IOException {
		WebDriver driver = Browser555.openBrowser("https://www.facebook.com/login/");
         
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 inputtext _9npi')]"));
		password.sendKeys("123456");
		ScreenShotMain.takeScreenShot(driver,"facebook");
	}
	

}
