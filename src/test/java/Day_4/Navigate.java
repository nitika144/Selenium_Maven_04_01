package Day_4;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigate {
	
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
        	driver.navigate().to("https://www.udemy.com/");
			URL url = new URL("https://www.amazon.in/");
     		driver.navigate().to(url);
         	System.out.println(driver.getCurrentUrl());
//			driver.get("https://www.flipkart.com/");
//			System.out.println(driver.getCurrentUrl());
//			driver.navigate().back();
//			System.out.println(driver.getCurrentUrl());
//			driver.navigate().forward();
//			System.out.println(driver.getCurrentUrl());
//			driver.navigate().refresh();
//			System.out.println(driver.getCurrentUrl());
//			driver.close();//first tab close
			
//			driver.get() method navigates to particular web page
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
//			driver.getTitle() method gives the title of current page
			System.out.println(driver.getTitle());
			
//			driver.getCurrentUrl() return the current page url
			System.out.println(driver.getCurrentUrl());

			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
//			driver.getPageSource() return the HTML code of the current page
//			System.out.println(driver.getPageSource());
			
//			driver.getWindowHandle() return one window ID for current page
			System.out.println(driver.getWindowHandle());
			
//			driver.getWindowHandles()
			Set<String> windowIDs = driver.getWindowHandles();
			List IDs = new ArrayList(windowIDs);
			System.out.println(IDs);
			driver.quit();//all tab close
		}
	}



