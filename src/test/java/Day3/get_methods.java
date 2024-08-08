package Day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_methods {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	//driver.get("https://demo.nopcommerce.com/register");//first method-get method
	URL nop = new URL ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //second-nevigate method
	//driver.get("nop");
	driver.navigate().to(nop);//navigate url page
	System.out.println(driver.getTitle());//title method
	//driver.getTitle();
	System.out.println(driver.getCurrentUrl());//cureect page url
	System.out.println(driver.getPageSource());//right click on page-view source page
	System.out.println(driver.getWindowHandle());//current page id
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	System.out.println(driver.getWindowHandles());//multiple links id
	driver.close();//close the tab
	driver.quit();
}
}
