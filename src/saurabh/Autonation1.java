package saurabh;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Autonation1 {
@AfterClass//100  1,2,3,4,5

	public void AfterClss() 
	{
	System.out.println("AfterClss");
	
    }
@BeforeClass
public void BeforeClass()
{
	System.out.println("BeforeClass");
}
	
	
	@Test
public void test1() 
	{
	System.out.println("Test1");
	
    }
	@Test
public void test2() 
	{
	System.out.println("Test2");
	
    }
	@Test
public void test3() 
	{
	System.out.println("Test3");
	
    }
	@BeforeMethod
	
public void BeforeMethod()
	{
	System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
		
	}
}
