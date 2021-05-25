package WebAutomationTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a()
	{
		System.out.println("Test case 1");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("**************************");
		System.out.println("Before Method ");
	}
	
	@BeforeSuite
	public void bs()
	{
	System.out.println("Before Suit method");
	}
    
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Bofore class method");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("BoforeTest method");
		
	}
	
	@AfterMethod
	public void AM()
	{
		//
		System.out.println("After method ");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("After Class method ");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("After Test Method");
	}
	
	@Test
	public void testcase()
	{
		System.out.println("Test case 2");
	}
	
	@AfterSuite
	public void As()
	{
		System.out.println("After Suite Method");
	}
	
}
