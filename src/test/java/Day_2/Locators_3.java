package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_3 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	
	driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts");
	driver.findElement( By.xpath("//a[text()='register']")).click();
	driver.findElement(By.xpath("//*[normalize-space(text()= ' register ')]")).click();
	
}
}
