package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action_doubleclick {
	public static void main(String[] args) {//double click
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	driver.switchTo().frame("iframeResult");
	WebElement frm= driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	frm.clear();
	frm.sendKeys("welcome");
	WebElement button= driver.findElement(By.xpath("/html/body/button"));
	Actions act= new Actions(driver);
	act.doubleClick(button).perform();
	//validate
	WebElement b= driver.findElement(By.xpath("//*[@id=\"field2\"]"));
	System.out.println(b.getAttribute("value"));
}
}
