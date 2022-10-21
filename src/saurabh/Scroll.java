package saurabh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
public static void main(String[]args) {
	WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
    WebElement hide =driver.findElement(By.xpath("//input[@id='hide-textbox']"));
  // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", hide);

   ((JavascriptExecutor)driver).executeScript("window.scrollBy(100,900)");


}

}
