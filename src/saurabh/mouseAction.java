package saurabh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {
	public static void main (String[]args) throws Exception {
		
		WebDriver driver = Browser555.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		
		actions.contextClick(rightclick);
    	Thread.sleep(2000);
	    WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
	    actions.contextClick(edit);
    	Thread.sleep(4000);
	    actions. build().perform();
    	Alert a = driver.switchTo().alert();
        a.accept();

        
        actions.contextClick(rightclick);
    	Thread.sleep(4000);
	    WebElement Cut = driver.findElement(By.xpath("//span[text()='Cut']"));
	    actions.contextClick(Cut);
    	Thread.sleep(4000);
	    actions. build().perform();
	    Alert aa = driver.switchTo().alert();
        aa.accept();
	
        actions.contextClick(rightclick);
    	Thread.sleep(4000);
	    WebElement Copy = driver.findElement(By.xpath("//span[text()='Copy']"));
	    actions.contextClick(Copy);
    	Thread.sleep(4000);
	    actions. build().perform();
	    Alert aaa = driver.switchTo().alert();
        aaa.accept();
        
        actions.contextClick(rightclick);
    	Thread.sleep(4000);
	    WebElement Paste = driver.findElement(By.xpath("//span[text()='Paste']"));
	    actions.contextClick(Paste);
    	Thread.sleep(4000);
	    actions. build().perform();
	    Alert aaaa = driver.switchTo().alert();
        aaa.accept();
        
        
        
	}

}
