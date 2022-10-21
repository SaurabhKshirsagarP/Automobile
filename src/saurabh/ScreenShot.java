package saurabh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

public static void main(String[]args) throws IOException {
	WebDriver driver = Browser555.openBrowser("https://vctcpune.com/selenium/practice.html");
	TakesScreenshot s = ((TakesScreenshot)driver);
	File source = s.getScreenshotAs(OutputType.FILE);
	File destination = new File("D:\\velocity\\vcity.jpg");
	FileHandler.copy(source, destination);
	
	
	
	
}
}
