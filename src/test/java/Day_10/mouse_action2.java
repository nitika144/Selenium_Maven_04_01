package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action2 {//right click
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		Actions act= new Actions(driver);
		act.contextClick().perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]"));
		driver.switchTo().alert();
}
}
