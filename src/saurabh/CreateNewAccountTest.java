package saurabh;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class CreateNewAccountTest {
	WebDriver driver;
	@BeforeMethod
	public void url() 
	{
		 driver =Browser555.openBrowser("https://www.facebook.com/");

	}
	
	@Test
public void LoginWithSignUP() throws Exception {
		

	CreateNewAccount createNewAccount = new CreateNewAccount(driver);
	createNewAccount.clickOnCreateAccount();
 String expectedTitle ="signup";
  String actualTitle = driver.getTitle();
  Assert.state(false, actualTitle, expectedTitle) ;      
	createNewAccount.enterName("saurabh", driver);
	createNewAccount.enterLastName("Kshirsagar");
	createNewAccount.enterEmail("Saurabhk2@gmail.com");
	
    createNewAccount.enterPassword("12344");
	createNewAccount.selectDay("27");
	createNewAccount.selectMonth("May");
	createNewAccount.selectYear("1997");

	createNewAccount.selectFemale();
	createNewAccount.selectmale();
	//createNewAccount.selectcustom();
	createNewAccount.clickOnSignUP();
	}
public static void main (String[]args) throws Exception {
	CreateNewAccountTest createNewAccountTest =new CreateNewAccountTest();
	createNewAccountTest.LoginWithSignUP();
}
}


