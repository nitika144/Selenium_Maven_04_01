package Day12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_taken {
public static void main(String[] args) throws IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/");	
	TakesScreenshot ts=driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File trg= new File ("C:\\Users\\hello\\eclipse-workspace\\Selenium_Maven_04_01\\src\\test\\java\\screenshot\\screenshot.png");
	FileUtils.copyFile(src, trg);
	
}
}
