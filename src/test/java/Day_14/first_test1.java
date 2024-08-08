package Day_14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class first_test1 {
	
	 ChromeDriver driver = new ChromeDriver();
		
	  @Test (priority = 1)
	   void tearUp() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  
	  @Test (priority = 2)
	  void Logo() {
		  Boolean logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]")).isDisplayed();
		  System.out.println(logo);
		  if(logo) 
			  System.out.println("Logo is displayed");
		  else
			  System.out.println("Logo isn't displayed");
	  }
	  
	  @Test  (priority = 3)
	  void Login() throws InterruptedException {
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  Thread.sleep(3000);
		  driver.findElement(By.className("oxd-button")).click();
		  Thread.sleep(3000);
	  }
	  
	  @Test (priority = 4)
	  void teaeDown() {
		  driver.close();	// closing the browser
	  }
	  
	  @AfterTest
		void at() {
			System.out.println("This is after test");
		}
		
	  @AfterSuite
	  void as() {
//		  System.out.println("This is After Logout method");
		  System.out.println("This is after suite");
	  }

}