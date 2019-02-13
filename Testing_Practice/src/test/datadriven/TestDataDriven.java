package test.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDriven {
	
	public WebDriver driver;
	
	public static FileInputStream file;
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	String filePath = "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\src\\test\\testdata\\data.xlsx";
	String sheetName = "Sheet1";
	
	@DataProvider
	public Object[][] getTestData(String filePath,String sheetName)
	{
		try {
			file = new FileInputStream(filePath);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		try {
			workbook = new XSSFWorkbook(file);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		sheet = workbook.getSheet(sheetName);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
			
		}
		
		return data;
	}
	
	@Test(dataProvider = "getTestData")
	public void getData(String s1,String s2,String s3)
	{
		System.out.println(s1+"  --  "+s2+"  --  "+s3);
	}
	
	@Test
	public void test1() throws IOException
	{
			file = new FileInputStream("C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\src\\test\\testdata\\data.xlsx");

			workbook = new XSSFWorkbook(file);
		
		sheet = workbook.getSheet("Sheet1");
		int i = sheet.getLastRowNum();
		System.out.println(i);
	}
	
	
	@Test
	public void test2()
	{
		
	}

}
