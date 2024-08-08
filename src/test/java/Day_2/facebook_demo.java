package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_demo {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
		List<WebElement>ele=driver.findElements(By.xpath("//*[@id=\"email\"]//following::*"));
		//List<WebElement>ele=driver.findElements(By.xpath("//*[@id='email']));//proceeding:*"));
		
					
			for (WebElement i: ele)
			{
				System.out.println(i.getText());
			
		}
}
}
