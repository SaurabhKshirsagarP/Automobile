package saurabh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMain {

		
		
		
		public static void takeScreenShot(WebDriver driver,String name) throws IOException  {
	
			File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("D:\\velocity\\"+name+".png"); // create object in that we declare our file save location
	   
		FileHandler.copy(source, destination);//is use for safety for file save as java location to our local location
	
	
	}

}
