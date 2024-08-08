package Day_14;

import org.testng.annotations.Test;

public class Grouping_intestNG {

@Test(priority=1,groups= {"sanity","regression"})
void LogininBymail() 
{
	System.out.println(" login email");
	
}
@Test(priority=2,groups= {"sanity"})
void LogininByfacebook() 
{
	System.out.println(" login facebook");
	
}
@Test(priority=3,groups= {"sanity"})
void LogininBytwitter() 
{
	System.out.println("twitter login");
	
}
@Test(priority=4,groups= {"sanity","regression", "functional"})
void signupBymail() 
{
	System.out.println("sign up mail");
	
}	
@Test(priority=5,groups= {"regression"})
void signupByfacebook() 
{
	System.out.println("signup  facebook");
	
}
@Test(priority=6,groups= {"regression"})
void signupBytwitter() 
{
	System.out.println("signup twitter");
	
}
@Test(priority=7,groups= {"sanity","regression"})
void paymentinrupees() 
{
	System.out.println("payment in rupees");
	
}
@Test(priority=8,groups= {"sanity"})
void paymentinDollar() 
{
	System.out.println("payment in Dollar");
}
@Test(priority=9,groups= {"regression"})
void paymentreturnbyBank() 
{
	System.out.println("return bank payment");
}

}
