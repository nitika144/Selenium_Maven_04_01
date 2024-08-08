package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting_D {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless=new");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(4000);
		driver.findElement(By.className("oxd-button")).click();
		Thread.sleep(4000);
		String actual_title = driver.getTitle();
		String expected_title = "OrangeHRM";
		if(actual_title.equals(expected_title))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
			
	}

}
