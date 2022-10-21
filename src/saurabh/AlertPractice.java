package saurabh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPractice {
	public static void main (String[]args) throws InterruptedException {
		WebDriver  driver = Browser555.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
//	    WebElement alert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//	    alert.click();
//	   
//	    Alert a = driver.switchTo().alert();
//	    String sms = a.getText();
//	
//	    System.out.println(sms);
//	    
//	    Thread.sleep(3000);
//	    a.accept();
	
//	    WebElement alert2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//	    alert2.click();
//	    Alert s = driver.switchTo().alert();
//	   
//	    String sk = s.getText();
//	    System.out.println(sk);
//	    Thread.sleep(3000);
//	    
	    //s.accept();    
	   // s.dismiss();
	  
		
		WebElement alert3 =  driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	    alert3.click();
	    Alert j = driver.switchTo().alert();
	 
	   Thread.sleep(3000);
	   j.sendKeys("hi");
	    System.out.println(j);
	    Thread.sleep(3000);

	  // j.accept();
	      j.dismiss();
	   
	
	
	}

}
