package DAy_13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		int rowsCount = rows.size();
		System.out.println("Total Number of Rows- " + rowsCount);//find total number of rows in Web Table
		List<WebElement>col =driver.findElements(By.xpath("//tbody/tr/th"));
		int columnscount=col.size();
		System.out.println("Total Number of Columns are- " + columnscount);//find total number of column in Web Table
		System.out.println();

		try { // Read specific row and column (3rd row, 1st column)
			WebElement specificCell = table.findElement(By.xpath(".//tbody/tr[3]/td[1]"));//learn Java
			System.out.println("Data in Third Row, First column- " + specificCell.getText());
		} catch (Exception e) {
			System.out.println("Error finding specific cell- " + e.getMessage());

		}
		System.out.println();
		// Read and print data from all rows and columns
		System.out.println("All rows and column table data-");
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (int i = 0; i < cells.size(); i++) {
				System.out.print(cells.get(i).getText() + " ");
			}
			System.out.println();
		}

		// Print book names whose author is "Amit"
		System.out.println();
		System.out.println("Books author is Amit-");
		for (WebElement row : rows) 
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			if (cells.size() >= 3) 
			{ 
				String bookName = cells.get(0).getText();
				String author = cells.get(1).getText();
				if (author.equals("Amit")) 
				{
					System.out.println(bookName);

				}
			}
		}

		// Find the sum of prices for all books
		int sum = 0;
		for (WebElement row : rows) 
		{
			List<WebElement> cells = row.findElements(By.tagName("td"));
			if (cells.size() >= 4) 
			{ 
			 String priceText = cells.get(3).getText();
				try 
				{
					int price = Integer.parseInt(priceText);
					sum = sum + price;
				} catch (NumberFormatException e) {
					System.out.println("Error " + priceText);
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Total price of all books -" + sum);

		driver.close();
	}
}

