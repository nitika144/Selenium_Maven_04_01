package Day_14;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class class_demo {
	@BeforeClass
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
	@AfterClass
	void Logout() 
	{
		System.out.println("this is Logout");
	}
}


