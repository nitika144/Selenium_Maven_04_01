package Day_14;

import org.testng.annotations.Test;

public class New_test 
{
	@Test(priority=1)//priority wise print(argument we can pass)
void OpenURL() 
{
	System.out.println("this is OpenURL");
}
	@Test(priority=2)//withoutannotation test method doesnot excute
void Login() 
{
		System.out.println("this is Login");
}
	@Test(priority=3)
void Logout() 
{
		System.out.println("this is Logout");
}

}