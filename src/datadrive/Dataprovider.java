package datadrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataprovider {

	
	
	public static String s="C:\\Users\\Admin\\Desktop\\Selenium\\Datadriven.xlsx";
	public static void main(String[] args) throws Exception {
		
	File file = new File(s);
	FileInputStream fis = new FileInputStream(file);
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet =workbook.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(0);
	XSSFCell cell = row.getCell(0);
	System.out.println(cell);
	System.out.println(sheet.getRow(0).getCell(0));
	}
	
	
	
	
}
