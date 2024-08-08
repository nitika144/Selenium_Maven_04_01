package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_mouse_actions {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		WebElement c= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("location of element in slider" + c.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(c, 100,0).perform();//add 100
		System.out.println("location of element in slider" + c.getLocation());
		//actions-is class, will be perform mouse action
		//action -is a interface use to store actions
}
}
