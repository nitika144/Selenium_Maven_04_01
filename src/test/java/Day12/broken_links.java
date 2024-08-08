package Day12;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");//broken links  
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("no.of links" + links.size());//48
		int brokenlinks=0;
		for(WebElement linkElement:links)
		{
			String hrefValue=linkElement.getAttribute("href");

			if ( hrefValue ==null||  hrefValue.isEmpty())
			{
				System.out.println("href Value is empty");	
				continue;
			}


			URL linkurl =new URL(hrefValue);
			HttpURLConnection conn= (HttpURLConnection) linkurl.openConnection();

			conn.connect();
			if(conn.getResponseCode()>400)
			{
				System.out.println(hrefValue+ " "  +  " Broken Link");
				brokenlinks++;
			}
			else 
			{
				System.out.println(hrefValue+ " "  +  " not Broken Link");

			}

			System.out.println("Total no of links" + brokenlinks);

		}
	}
}

