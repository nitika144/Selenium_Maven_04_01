package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args)  {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	     Select countryDropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
	    countryDropdown.selectByVisibleText("Germany");
 
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
}