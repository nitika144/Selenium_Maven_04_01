package Day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboarddemo {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement Reg= driver.findElement(By.xpath("//a[@class='ico-register']"));
	
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(Reg).keyUp(Keys.CONTROL).perform();
		
		
		Set <String> windowid=	driver.getWindowHandles();
        ArrayList<String> wid= new ArrayList(windowid);
		
		String parentwindowid = wid.get(0);
		String childWindowid = wid.get(1);
		driver.switchTo().window(childWindowid);//action of childid 
		
		driver.switchTo().window(parentwindowid);//action of parentid 
				
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println(driver.isdisplayed));
		
		WebElement radiobutton = driver.findElement(By.xpath(""));
		radiobutton.click();
		
	}
		
	
}
