package test.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Testing_Interview {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String path = "C:\\Users\\Spandana\\git\\Testing_Practice\\Testing_Practice\\Input\\data.xlsx";
		XSSFRow rows;
		XSSFCell cells;
		String uid, pwd;
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("sheet1");
		
		int row_count = ws.getFirstRowNum();
		
		for (int i = 0; i < row_count; i++) {
			
			rows=ws.getRow(i);
			
			uid = rows.getCell(0).getStringCellValue();
			pwd = rows.getCell(1).getStringCellValue();
			
			System.out.println(uid + "  "+pwd);
				
		}

	}

}
