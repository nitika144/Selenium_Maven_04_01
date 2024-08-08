package JavascriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_script {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement inputbox=driver.findElement(By.id("name"));
	js.executeScript("arguments[0].setAttribute('value', 'john')", inputbox);
	WebElement male_rd=driver.findElement(By.id("male"));;
	js.executeScript("arguments[0].click();",male_rd);
		
		
	}
}
