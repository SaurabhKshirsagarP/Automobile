package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[]args) {
	WebDriver driver = Browser555.openBrowser("https://www.amazon.in/");
   
	WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

    Actions actions = new Actions(driver);
    actions.moveToElement(signin);
    actions.perform();

    WebElement membership =driver.findElement(By.xpath("//span[text()='Memberships & Subscriptions']"));
    membership.click();
	

    WebElement login =	driver.findElement(By.xpath("//input[@id='ap_email']"));
    login.sendKeys("77777");
	}
}