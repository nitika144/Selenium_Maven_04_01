package Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_method {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
		
		// OPEN URL -- get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		 // DECLARATION
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		// USERNAME 
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		//PASSWORD
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.close();
	}


}
