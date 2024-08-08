package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class text_compare {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("hello");
		Actions act=new Actions(driver);
	     
		//		cntrl+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();//keys.control
		//		cntrl+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();//tab
		//		cntrl+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		//cntrl+shift+A
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").perform();
		//enter
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

	}
}
