package saurabh;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
  
public class FaceBookloginTest {
	
//	@Test
//public void LoginWithValidCredentails()  
//	{
//    WebDriver driver = Browser555.openBrowser("https://en-gb.facebook.com/");
//	FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
//	SoftAssert softAssert =new SoftAssert();
//	System.out.println("test1");
//	faceBookLoginPage.enterEmail("saurabhkshirsagar7773@gmail.com");
//	faceBookLoginPage.enterPassword("Saurabh@77", driver);
//	faceBookLoginPage.clickOnLogin();
//    boolean result = true;
//    softAssert.assertTrue(result);
//	String expectedTitle ="Home page";
//    String actualTitle = driver.getTitle();
//    softAssert.assertEquals(expectedTitle,actualTitle);
//    System.out.println("Hello");
//    softAssert.assertAll();
//	}
	
	
	@Test
public  void LoginWithoutPassword()
{  
		System.out.println("test2");
		WebDriver driver = Browser555.openBrowser("https://en-gb.facebook.com/");
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.enterEmail("saurabh@gmail.com");
		faceBookLoginPage.enterPassword("12345", driver);
	    faceBookLoginPage.clickOnLogin();
        String expectedTitle ="Home Page";
        String actualTitle = driver.getTitle();
        Assert.isTrue(false, actualTitle, expectedTitle) ;       
}
//	
//@Test
//public void LoginWithoutEmailId() 
//
//{
//	System.out.println("test3");
//	WebDriver driver = Browser555.openBrowser("https://en-gb.facebook.com/");
//	FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
//	faceBookLoginPage.enterPassword("12345", driver);
//	faceBookLoginPage.clickOnLogin();
//}	
//@Test
//	public void ClickOnSignUp()
//	{
//	System.out.println("Test4");
//	WebDriver driver = Browser555.openBrowser("https://en-gb.facebook.com/");
//	FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
//	faceBookLoginPage.clickOnCreateAccount();
//	}




}



