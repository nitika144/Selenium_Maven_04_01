package DAy_13;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class certificate_of_deposits {
public static void main(String[] args) throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		String file=  System.getProperty("user.dir") + "\\Testing_data\\certificate-of-deposit.xlsx";
		int rows=ExcelUtils.getRowCount(file, "Sheet1");
		//read
		for(int i=1;i<=rows; i++)//row
		{
			String depositamnt=ExcelUtils.getCellData(file, "Sheet1", i,0);//deposit amount
			String months=ExcelUtils.getCellData(file, "Sheet1", i,1);//months
			String Interestrate=ExcelUtils.getCellData(file, "Sheet1", i,2);//interst rate
			String coump=ExcelUtils.getCellData(file, "Sheet1", i,3);//coumpounding
			String exp_percentage=ExcelUtils.getCellData(file, "Sheet1", i,4);//percentage per annual
			
			Thread.sleep(3000);
			WebElement deposit_amnt = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
			deposit_amnt.clear();
			deposit_amnt.sendKeys(depositamnt);
			WebElement length_month = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
			length_month.clear();		
			length_month.sendKeys(months);
			WebElement interest_rate = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
			interest_rate.clear();
			interest_rate.sendKeys(Interestrate);
			Thread.sleep(3000);
			WebElement compdrpdown = driver.findElement(By.xpath("//*[@id=\"lEcE7Em2UkSqUmHuYCEnK\"]/div/div/div/div/app-cd-calculator/div/div[1]/form/div/div[4]"));
			compdrpdown.click();
			WebElement option = driver.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span"));
			option.click();
			
			WebElement runbutton = driver.findElement(By.xpath("//*[@id=\"CIT-chart-submit\"]"));
			runbutton.click();
			

			Thread.sleep(3000);
			String act_per  = driver.findElement(By.xpath("//*[@id=\"cdAPY\"]")).getText();
			if (exp_percentage.equals(act_per))
					{
				System.out.println("Test passed");
				ExcelUtils.setCellData(file, "Sheet1", i, 6, "passed");
				ExcelUtils.fillGreenColor(file, "Sheet1", i, 6);
			} 
			else {
				System.out.println("Test failed");
				ExcelUtils.setCellData(file, "Sheet1", i, 6, "failed");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 6);
				
		}
	      }
	     }
       }
