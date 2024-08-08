package Day_14;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_demo {
	@BeforeSuite
	void Login() 
	{
		System.out.println("this is before suite");	
	}
	@Test
	void at() 
	{
		System.out.println("this is at");
	}
	
	@BeforeTest
	void Search() 
	{
		System.out.println("this is before test");
	}
	@AfterTest
	void AdvanceSearch() 
	{
		System.out.println("this is after test");
	}
	@Test
	void in() 
	{
		System.out.println("this is in");
	}
	
	@AfterSuite
	void Logout() 
	{
		System.out.println("this is after suit");
	}
}


