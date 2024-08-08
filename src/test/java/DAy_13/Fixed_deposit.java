package DAy_13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fixed_deposit {
	public static void main(String[] args) throws IOException, InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		String file=  System.getProperty("user.dir") + "\\Testing_data\\SImpleInteret.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		//read
		for(int i=1;i<=rows; i++)//row
		{
			String principle=ExcelUtils.getCellData(file, "Sheet1", i,0);
			String rateofinterest=ExcelUtils.getCellData(file, "Sheet1", i,1);
			String per1=ExcelUtils.getCellData(file, "Sheet1", i,2);
			String per2=ExcelUtils.getCellData(file, "Sheet1", i,3);
			String fre=ExcelUtils.getCellData(file, "Sheet1", i,4);
			String exp_e=ExcelUtils.getCellData(file, "Sheet1", i,5);

			 driver.findElement(By.name("principal")).sendKeys(principle);
	    	 driver.findElement(By.id("interest")).sendKeys(rateofinterest);
	    	 driver.findElement(By.id("tenure")).sendKeys(per1);
	    	 Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
	    	 perdrp.selectByVisibleText(per2);
	    	 
	    	 Select fredrp=new Select(driver.findElement(By.id("frequency")));
	    	 fredrp.selectByVisibleText(fre);
	    	 
	    	 
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	            WebElement calculateBtn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
	            js.executeScript("arguments[0].click()", calculateBtn);
	            WebElement clearBtn = driver.findElement(By.xpath("//img[@class='PL5']"));
	            js.executeScript("arguments[0].click()", clearBtn);

	            String actMValue = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();

	            if (Double.parseDouble(exp_e) == Double.parseDouble(actMValue)) {
	                System.out.println("Test passed");
	                ExcelUtils.setCellData(file, "Sheet1", i, 7, "passed");
	                ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
	            } else {
	                System.out.println("Test failed");
	                ExcelUtils.setCellData(file, "Sheet1", i, 7, "failed");
	                ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
	            }
	        }
	    }
}
