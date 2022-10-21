package saurabh;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBookLoginPage {
		
		@FindBy(xpath="//input[@id='email']")private WebElement email;
		@FindBy(xpath="//input[@id='pass']")private WebElement pass;
		@FindBy(xpath="//button[@name='login']")private WebElement login;
		@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot;
		@FindBy(xpath="//a[@role='button']")private WebElement create;
		@FindBy(xpath="//a[text()='Create a Page']")private WebElement createPage;
		
		
		

		public  FaceBookLoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}

		public void enterEmail(String emailId) 
		{
			email.sendKeys(emailId);
		}
	   
		public void enterPassword(String password,WebDriver driver) 
	    {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
			wait.until(ExpectedConditions.visibilityOf(pass));
			pass.sendKeys("password");
	    }

		public void clickOnLogin() 
		{
			forgot.click();
			
		}
		
		public void clickOnCreateAccount() 
		{
		create.click();
	    }
		public void clickOnCreatePage()
		{
			createPage.click();
		}
	}


