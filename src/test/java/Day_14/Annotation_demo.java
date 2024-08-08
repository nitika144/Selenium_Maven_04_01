package Day_14;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_demo {
	@BeforeMethod
	void Login() 
	{
		System.out.println("this is Login");	
	}
	@Test(priority=1)//main method
	void Search() 
	{
			System.out.println("this is search");
	}
	@Test(priority=2)//main method
	void AdvanceSearch() 
	{
			System.out.println("this is AdvanceSearch");
	}
	@AfterMethod
	void Logout() 
	{
			System.out.println("this is Logout");
	}
}
