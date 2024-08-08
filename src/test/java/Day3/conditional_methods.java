package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_methods {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/register");
	
	driver.manage().window().maximize();
	//isdisplayed -logo
	Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(logo);
	//is enabled
	Boolean search = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	System.out.println(search);
	//is selected
	WebElement radiobutton = driver.findElement(By.xpath("//input[@id='gender-male']"));
	radiobutton.click();//radio button
	
	Thread.sleep(5000);
	System.out.println(radiobutton.isSelected());
	
	WebElement femalebutton = driver.findElement(By.xpath("//input[@id='gender-female']"));
	femalebutton.click();
	
	Thread.sleep(5000);
	System.out.println(femalebutton.isSelected());
	
	driver.close();
}
}
