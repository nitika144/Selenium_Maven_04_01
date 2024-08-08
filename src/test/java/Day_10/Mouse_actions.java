package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {//move to element(element-opencard demo)
	
		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo-opencart.com/");
		WebElement Desktop=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));//desktop
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (2)']"));//mac
		
		Actions act= new Actions(driver);
		//act.moveToElement(Desktop).moveToElement(mac).click().build().perform();
		act.moveToElement(Desktop).moveToElement(mac).click().perform();//perform method automatically call the build method
		
}
}

