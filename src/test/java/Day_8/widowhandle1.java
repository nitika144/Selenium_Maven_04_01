package Day_8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class widowhandle1 {
			public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
			
		Set <String> id=	driver.getWindowHandles();
		System.out.println(id);
		
		ArrayList<String> all= new ArrayList(id);
		
		String parentwindowid = all.get(0);
		
		String childWindowid = all.get(1);
		driver.switchTo().window(childWindowid);
		
		
				System.out.println(driver.getTitle());
				
				}
		}

	

