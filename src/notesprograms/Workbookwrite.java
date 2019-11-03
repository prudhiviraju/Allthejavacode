package notesprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Workbookwrite {

	
	static String path="C:\\Users\\Admin\\Desktop\\Selenium\\Datadriven.xlsx";
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(5);
		XSSFCell cell=row.createCell(0);
		XSSFCell cell1=row.createCell(1);
		cell.setCellValue("prudhvi R@zz");
		cell1.setCellValue("FUCKYOU25");
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		
		wb.close();
		
		
		
		
	}
	
}
