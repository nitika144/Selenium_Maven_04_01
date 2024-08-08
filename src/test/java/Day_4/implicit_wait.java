package Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	
	// OPEN URL -- get()
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	//IMPLICIT WAIT 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	// USERNAME 
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	//PASSWORD
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	
	
	
}
}
