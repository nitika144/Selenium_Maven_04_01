package Day11;

import java.time.Duration;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow_open {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://demo.nopcommerce.com/");
	driver.get("https://www.opencart.com/");
	driver.switchTo().newWindow(WindowType.TAB);//new tab window
	driver.switchTo().newWindow(WindowType.WINDOW);//open in same window 
	

	
}
}
