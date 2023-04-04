package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	static XSSFWorkbook workbook;
	
	public static String[][] readCompanyData()
	{
		try 
		{
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTestingSeptemberBatch\\TestData\\CompanyTestData.xlsx");
		workbook = new XSSFWorkbook(file);
		}
		catch(Exception e) {
			System.out.println("Test data file is not available");
		}
		XSSFSheet sheet = workbook.getSheet("data");
		int row = sheet.getLastRowNum();
		int column = sheet.getRow(1).getLastCellNum();
		
		String data[][] = new String[row][column];  // empty array of size "ROW=4" and "Column = 5"
		
		
		for(int i = 0; i<row ; i++) // row
		{
			for(int j = 0;j<column ;j++) // column
			{
			data[i][j] =	sheet.getRow(i+1).getCell(j).toString();
			
			}
		}
		return data;	
	}
}
