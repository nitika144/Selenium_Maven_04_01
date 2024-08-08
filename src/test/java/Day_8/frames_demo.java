package Day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_demo {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("hello");
		//approach 1-id/name
		//driver.switchTo().frame("frm1");
		
		//approach 2-webelement
		
		driver.switchTo().frame("frm1");
		WebElement drpdwn=driver.findElement(By.xpath("//*[@id='selectnav1']"));
		
		drpdwn.click();
				
//		Thread.sleep(4000);
//		drpdwn.selectByVisible("_java");
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("frm2");
		
		
		
	}

}
