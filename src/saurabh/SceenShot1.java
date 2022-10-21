package saurabh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SceenShot1 {
	public static void main(String[]args) throws IOException {
		WebDriver driver = Browser555.openBrowser("https://www.facebook.com/  ");
		File source = ((TakesScreenshot)driver ).getScreenshotAs(OutputType.FILE);
	 
		File destination = new File("D:\\velocity\\Vcity1.jpg");
	   
		FileHandler.copy(source, destination);
	
	
	
	
	}

}
