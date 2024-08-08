package Day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameters {
	ChromeDriver driver;
	@BeforeClass

	void Setup() 
	{
		driver = new ChromeDriver();

	}

	@Test(priority=2, dataProvider="dp")

	void TestLogin(String email, String passwd) 
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fsoftware");
		driver.findElement(By.id("Email")).sendKeys("email");
		driver.findElement(By.id("Password")).sendKeys("passwd");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		String exp = "nopcommerce demo store";
		String act =driver.getTitle();
		Assert.assertEquals(exp, act);
	}
	@AfterClass

	void tearup() 

	{
		driver.close();
	}

	@DataProvider (name="dp", indices= {0,1})
	String [] [] LoginData()
	{
		String dataString [] [] = {
				{"abc@gmail","test"},
				{"john@gmail.com","test12"},
				{"mk@gmail.com","hello"}
		};


		return null;
	}

}

