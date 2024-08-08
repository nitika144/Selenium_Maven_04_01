package Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class alterts_methods {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    
	   WebElement element=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	   driver.switchTo().alert().accept();//altert accept
	   driver.findElement(By.xpath("//button[@onclick='jsconfirm()']")).click();
	   Thread.sleep(3000);
	   driver.switchTo().alert().dismiss();
	   driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	   Alert alert = driver.switchTo().alert();
	   Thread.sleep(5000);
	   alert.sendKeys("hello");
	   Thread.sleep(5000);
	   alert.accept();
	   Thread.sleep(5000);
	   System.out.println(driver.findElement(By.xpath("//*[@id=\'result']")).getText());
	}
}

