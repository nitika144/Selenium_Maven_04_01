package Day_14;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserations {
	@Test

	void test () 
	{
//		int x=20;
//		int y=40;
//		if(x==y)
//		{
//			System.out.println("test passed");
//		}
//		else
//		{
//			System.out.println("test failed");
//		}
		//Assert.assertEquals(x, y);//failed
		//Assert.assertFalse(false);//fail
		//Assert.assertTrue(true);//pass
		
		//Assert.fail();//intentially fail the test
		
//		int a=30;
//		int b=20;
//		Assert.assertEquals(actual, expcepted,description);
//		Assert.assertEquals(a>b,true, "a is not smaller than b");
		String a1="30";
		String a2="20";
		{
	Assert.assertEquals(a1, a2, "both value must be equal");//passed
		
	}
		if(true)
			{
			Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();//Assert.assertFalse(false);
			}	
	}
}

