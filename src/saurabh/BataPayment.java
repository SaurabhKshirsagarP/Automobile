package saurabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BataPayment {
	
	
	@FindBy(xpath="//input[@id='shippingEmaildefault']")private WebElement email;
	@FindBy(xpath="//div[@id='cc-phone-input-box']")private WebElement mobileNumber;
	@FindBy(xpath="//label[@for='ms']")private WebElement title;
	@FindBy(xpath="//input[@id='shippingFirstNamedefault']")private WebElement firstName;
	@FindBy(xpath="//input[@id='shippingLastNamedefault']")private WebElement lastName;
	@FindBy(xpath="//input[@id='shippingZipCodedefault']")private WebElement pincode;
	@FindBy(xpath="//input[@id='shippingStatedefault']")private WebElement state;
	@FindBy(xpath="//input[@id='shippingAddressCitydefault']")private WebElement city;
	@FindBy(xpath="//button[@name='submit']")private WebElement processedToPayment;
	
	
public  BataPayment(WebDriver driver)	
	{
	PageFactory.initElements(driver, this);
	}

public  void enterEmail(String EmaiId)
{
	email.sendKeys(EmaiId);
}

public void enterMobileNumber(String Number)
{
	mobileNumber.sendKeys(Number);
}

public void enterFirstName(String nameFirst) 
{
	firstName.sendKeys(nameFirst);
}

public void enterLastName(String nameLast)
{
	lastName.sendKeys(nameLast);
}
public void enterpincode(String code)
{
pincode.sendKeys(code);
}

public void enterStateName(String stateName) 
{
	state.sendKeys(stateName);
}

public void enterCityName(String cityName)
{
	city.sendKeys(cityName);
}

public void  clickOnProceedOfPayment() 
{
	processedToPayment.click();
}

}
