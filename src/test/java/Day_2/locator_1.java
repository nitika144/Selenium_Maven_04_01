package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_1 {
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php");
//	
//	driver.findElement(By.id("search_query_top")).sendKeys("top");//id
//	driver.findElement(By.name("submit_search")).click();//name
//	driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();//linkText
//	driver.findElement(By.partialLinkText("Faded Short")).click();//partialLinkText
	
	//locator-
	List<WebElement>slider=driver.findElements(By.className("homeslider-container"));
	System.out.println("number of sliders are " +slider.size());//find slider in page
	
	List<WebElement>images=driver.findElements(By.tagName("img"));
	System.out.println("number of images are " + images.size());//find images in page
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("The number of links are " + links.size());//find link

		
        
}
}
