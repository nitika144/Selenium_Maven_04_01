package Day_5;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class drop_down_handle {
	public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();

			driver.get("https://testautomationpractice.blogspot.com/");

		   // Maximizes the Window
			driver.manage().window().maximize();

           //	Scroll down using sendKeys to the body
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000); // Adding a small delay to ensure the page is scrolled
			
			WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
			drop.click();
			
			Select dropdown = new Select(drop);
//			// Select by Visible Text
			dropdown.selectByVisibleText("Germany");
			Thread.sleep(3000);
//			// Select by Value 
			dropdown.selectByValue("uk");
			Thread.sleep(5000);
//			 Select by Index
			dropdown.selectByIndex(4); // FRANCE
			Thread.sleep(3000);
			
			List <WebElement> cs = driver.findElements(By.xpath("//select[@id='country']/option"));
			System.out.println(" total country : " + cs.size());
			
			System.out.println("country name");
//			 for (WebElement i:cs )
//		       {
//		    	   System.out.println(i.getText());
//		       }
			
			 for (int i=0; i<cs.size();i++)
			 {
				 System.out.println(cs.get(i).getText());
			 }
			driver.close();
		}
	}
//DROPDOWN
//
//Select
//byvisibletext
//byvalue
//byindex
//
//Select 
//single option
//capture all options an d find size 
//printing options
//select mulitple options