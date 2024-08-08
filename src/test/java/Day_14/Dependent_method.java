package Day_14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent_method {
	
@Test (priority=1)
	void OpenURL2() 
	{
	Assert.assertTrue(true);
}

@Test (priority=2, dependsOnMethods= {"OpenURL2"})
void Login() 
{
Assert.assertTrue(true);
}
@Test (priority=3, dependsOnMethods= {"Login"})
void Search() 
{
Assert.assertTrue(false);
}
@Test (priority=4, dependsOnMethods= {"Login", "Search"})
void AdvanceSearch() 
{
Assert.assertTrue(false);
}
@Test (priority=5, dependsOnMethods= {"Login"})
void Logout() 
{
Assert.assertTrue(true);
}
}
