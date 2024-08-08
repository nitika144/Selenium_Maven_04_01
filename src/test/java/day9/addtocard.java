package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocard {
	public static void main(String[] args) throws InterruptedException  {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-4']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).getText().contains("2"));
}
}
