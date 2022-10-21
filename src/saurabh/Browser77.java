package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser77 {
public static void main(String[]args) {
	WebDriver driver = Browser555.openBrowser("https://www.facebook.com/login/");
     WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'1kbt')])[1]"));
     email.sendKeys("12345");

     WebElement em = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/div/input"));
     em.sendKeys("12345");

     WebElement password = driver.findElement(By.xpath("//html//body//div//form///div//input"));
     password.sendKeys("12345");
}
}
