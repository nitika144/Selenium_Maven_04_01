package Day_14;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardvsAsseration {
//	@Test

//	void test () 
//	{
//		int x=20;
//		int y=40;
//		{
//			//Assert.assertEquals(x, y);
//			Assert.assertEquals(x>y, true,"x is not equal to y");
//		}
//	}
	@Test
	void HardAsseration()//hardAsseration-static method
	{
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		System.out.println("testing...");
		Assert.assertTrue(false);//failed
		System.out.println("example of hard asseration");
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
}
//	
//	void SoftAsseration () 
//	{
//		System.out.println("testing...");
//		System.out.println("testing...");
//		System.out.println("testing...");
//		SoftAssert sa=new SoftAssert();
//		System.out.println("example of soft asseration");
//		sa.assertTrue(true);
//		sa.assertTrue(true);
//		sa.assertTrue(true);
//		sa.assertAll();//required
//
//	}
//}

