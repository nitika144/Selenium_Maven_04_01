package Day_8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment4 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement account = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act = new Actions(driver);
		act.dragAndDrop(bank, account).perform();

		WebElement Acc = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Account = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(Acc, Account).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accounts = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(sales, accounts).perform();
		WebElement amt = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));

		WebElement amounts = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(amt,amounts).perform();

	}
}
