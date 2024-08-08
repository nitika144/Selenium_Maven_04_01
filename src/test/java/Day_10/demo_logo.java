package Day_10;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_logo {
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://demo.nopcommerce.com/register");
	WebElement c= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	System.out.println(c.getLocation());//19,80
	//driver.manage().window().minimize();
	//driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	Point p=new Point(86,30);
	driver.manage().window().setPosition(p);//20,80
	System.out.println("value of element" + c.getLocation());
	
	
	
	
	
	
	 
	
	
	
}
}