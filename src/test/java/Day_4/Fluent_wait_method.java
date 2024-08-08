package Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait_method {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
			
			// OPEN URL -- get()
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();
			
			
		FluentWait mywait = new FluentWait(driver);
		
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(ElementNotInteractableException.class);
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		// USERNAME 
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		// PASSWORD
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.close();
		}
	}
//WAIT (to stop code for specific period of time)
//3 wait commands
//will be used to solve sync problem in automation
//
//Thread.sleep(ms) // java
//
//implicit wait 
//explicit wait
//fluent wait 
//
//sleep() provided by java itself (not selenium)
//
//Adv:
//1) Easy to use 
//Dis:
//1) if time is not sufficient then you will get exception
//2) it will wait for max time out this will reduce the performance script 
//3) multiple times 
//
//implicit wait :
//Adv:
//1) single time/ one statement 
//2) it will not wait till max time if the element is available it will execute
//3) Applicable to all elements
//4) Easy to use
//
//Dis:
//1) If the time is not sufficient then you will get exception.
//
//Explicit wait :
//Declaration (driver,duration)
//
//1) condition based it will work more effectively.
//2) finding element is inclusive.
//3) it will wait for condition to be true
//
//
//Fluent Wait:
//
//NAVIGATION Commands 
//navigate().to(url)
//navigate().to()

