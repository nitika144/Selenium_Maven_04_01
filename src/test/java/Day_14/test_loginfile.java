package Day_14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test_loginfile {
	WebDriver driver;//global
	//constructor
	//Login lp;
	Logon_page2 lp;

	@BeforeClass
	void setup() throws InterruptedException 
	{
		driver= new ChromeDriver();//chrome,etc
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test (priority=2)
	void TestLogin() throws InterruptedException  
	{
		Thread.sleep(2000);
		lp.setUserName("Admin");
		lp.setpassWrod("admin123");
		lp.clicksubmit();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test (priority=1)
	void Logo_check() throws InterruptedException  
	{
		Thread.sleep(2000);
		lp= new Logon_page2(driver) ;
		Assert.assertEquals(lp.checklogo().booleanValue(),true);
	}
	@AfterClass
	void tearDown() 
	{
		driver.close();
	}
}
