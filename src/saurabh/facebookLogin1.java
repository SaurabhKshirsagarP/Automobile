package saurabh;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookLogin1 {
	public static void main (String[]args) throws EncryptedDocumentException, IOException, Exception {
	WebDriver driver =	Browser555.openBrowser("https://www.facebook.com/");
	Thread.sleep(2000);
	String emailID = Paramatrization.getExcelData(0,0, "SaurabhK");
	Thread.sleep(2000);

	WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
    email.sendKeys(emailID);
	
    Thread.sleep(2000);

    String password = Paramatrization.getExcelData(1,0, "SaurabhK");

	WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
    pass.sendKeys(password);
	
	
	WebElement login =driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	}

}
