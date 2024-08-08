package Day_14;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParrallelDemo {
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	void setup(String br) throws InterruptedException
	{
		switch (br)
		{
		case "chrome": driver=new ChromeDriver();
		break;
		case "edge": driver=new EdgeDriver();
		break;
		case "firefox": driver=new FirefoxDriver();
		break;
		default: System.out.println("invalid browser");
		return;
		}
		Thread.sleep(2000);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test (priority=1)
	void Logo() throws InterruptedException 

	{
		Thread.sleep(2000);
	Boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	if(logo)
		Assert.assertTrue(true);
	else
		Assert.fail();
	}
	@Test(priority=2)
	
	void Login() throws InterruptedException 

	{
		
		Thread.sleep(2000);					
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String exp = "OrangeHRM";
		  String act = driver.getTitle();
		  
		  Assert.assertEquals(exp, act,"test is failed");
		  }
	
	
	@AfterClass
	void teardown() 

	{
		//driver.close();
	}
}
