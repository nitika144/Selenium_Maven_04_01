package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_2 {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");//tag ID#
	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");//tag and ID#
	
	//tag and class
//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");//tag and class
	
	//tag and attributes
//	driver.findElement(By.cssSelector("input[name='q']")).sendKeys("MacBook");
	
	//tag,class and attributes
//	driver.findElement(By.cssSelector("input.search-box-text [name='q']")).sendKeys("MacBook");
	
	//search
	driver.findElement(By.cssSelector("button.button-1")).click();//name
}
}
