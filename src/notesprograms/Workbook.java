package notesprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Workbook {
	
	
	static String path ="C:\\Users\\Admin\\Desktop\\Selenium\\Datadriven.xlsx";
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sh =wb.getSheet("Sheet1");
		org.apache.poi.ss.usermodel.Row row2 =sh.getRow(1);
		
		System.out.println(row2.getCell(0));
		System.out.println(row2.getCell(1));

	
		
		wb.close();
		
		
		
			}
	

}
