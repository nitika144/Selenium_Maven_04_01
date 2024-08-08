package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm_demo {
 public static void main(String[] args) throws InterruptedException {
	 
	ChromeDriver driver =new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys("Admin");
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 
	 driver.findElement(By.className("button.oxd-button")).click();
	 driver.close();
	
}
}
