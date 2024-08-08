package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class automationbookstore_demo {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://automationbookstore.dev/");
	WebElement selfelement=driver.findElement(By.id("pid3"));
	System.out.println(driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(selfelement)).getText());
}
}

