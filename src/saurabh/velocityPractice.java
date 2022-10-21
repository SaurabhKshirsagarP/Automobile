package saurabh;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class velocityPractice {
@FindBy(xpath="//select[@id='dropdown-class-example']")private WebElement dropDown;

public  velocityPractice(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}

public void SelectDropDown() 
{
	Select s = new Select(dropDown);
	List<WebElement>list =s.getOptions();
	for(int i=0;i<=list.size();i++) {
	String dropDownValue =list.get(i).getText();
    System.out.println("dropdown values are "+dropDownValue);
  
} 
}
}
//Get All option from dropdown
//WebElement month_dropdown=driver.findElement(By.id("month"));
//
//Select month=new Select(month_dropdown);
//
//List<WebElement> dropdown=month.getOptions();
//
// for(int i=0;i<dropdown.size();i++){
//
// String drop_down_values=dropdown.get(i).getText();
//
// System.out.println("dropdown values are "+drop_down_values);
//
// }
