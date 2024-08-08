package Day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vision_demo {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);		
				
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("111"); //frame1
		
		//frame3
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame2);
	
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("333");
		
		
}
}