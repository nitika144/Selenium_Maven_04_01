package JavascriptExcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoom_demo {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = driver;
		js.executeScript("document.body.style.zomm='50%'");//setzone 50%
		Thread.sleep(3000);
		js.executeScript("document.body.style.zomm='80%'");//setzone 80%
		
	}
}
