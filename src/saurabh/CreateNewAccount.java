package saurabh;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	@FindBy(xpath="//a[text()='Create New Account']")private WebElement create;
	@FindBy(xpath="//input[@name='firstname']")private WebElement name;
	@FindBy(xpath="//input[@name='lastname']")private WebElement lastName;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement newPassword;
	@FindBy(xpath="//select[@id='day']")private WebElement date;
	@FindBy(xpath="//select[@id='month']")private WebElement month;
	@FindBy(xpath="//select[@id='year']")private WebElement year;
	@FindBy(xpath="//label[text()='Female']")private WebElement female;
	@FindBy(xpath="//label[text()='Male']")private WebElement male;
	@FindBy(xpath="//label[text()='Custom']")private WebElement custom;
	@FindBy(xpath="//button[@name='websubmit']")private WebElement signUp;
	
public CreateNewAccount(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void clickOnCreateAccount() 
{
create.click();
}
public void enterName(String firstName,WebDriver driver)
{
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(30000));
	wait.pollingEvery(Duration.ofMillis(10000));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(name));
	name.sendKeys(firstName);
}
public void enterLastName(String surname) 
{
	lastName.sendKeys(surname);
	
}
public void enterEmail(String emailId)
{
	email.sendKeys(emailId);
}
public void enterPassword(String password)
{
	newPassword.sendKeys(password);
}

public void selectDay (String BirthDate) 
{
	date.sendKeys(BirthDate);
}
	
public void selectMonth (String BirtMonth)
{
	month.sendKeys(BirtMonth);
}
public void selectYear (String BirthYear) 
{
	year.sendKeys(BirthYear);
}
public void selectFemale ()
{
	female.click();

}
public void selectmale ()
{
	male.click();

}
public void selectcustom ()
{
	custom.click();

}
public void clickOnSignUP ()
{
	signUp.click();

}

}
