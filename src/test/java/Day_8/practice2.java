package Day_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

public static void main(String[] args) {
	
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/iframe");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
			driver.switchTo().frame(frame);
			WebElement content = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
			System.out.println(content.getText());
			String s = "Your content goes here.";
			if(s.equals(content.getText()))
					System.out.println("true");
			else
				System.out.println("false");
			driver.close();
		}
}

