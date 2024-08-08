package DAy_13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingExcel {
	public static void main(String[] args) throws InterruptedException, IOException {
		//xcelfile path
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\Testing_data\\Data.xlsx");
		//FileInputStream file = new FileInputStream("C:\\Users\\hello\\eclipse-workspace\\Selenium_Maven_04_01\\Testing_data\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);//apachepoi
		XSSFSheet sheet = workbook.getSheet("Sheet1");//Name
		//XSSFSheet sheet = workbook.getSheetAt(0);//by index
		int rows=sheet.getLastRowNum();//row no.
		int cell=sheet.getRow(1).getLastCellNum();//cell no.

		System.out.println(rows);//5
		System.out.println(cell);//4
		for(int r=0;r<=rows; r++)//row
		{
			XSSFRow currentRow=sheet.getRow(r);

			for(int c=0;c<cell; c++)//cell
			{
				//XSSFCell cellValue=currentRow.getCell(c);
				//String Cell =cellValue.toString();
				String cellValue=currentRow.getCell(c).toString();
				System.out.println(cellValue + " ");
			}
			System.out.println();//formating

		}
		workbook.close();
		file.close();
	}
}



