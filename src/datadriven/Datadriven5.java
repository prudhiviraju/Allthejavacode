package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven5 {
	
	public void driven() throws IOException {
		
		Workbook workbook;
		File file = new File("C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Desktop\\\\\\\\Selenium"
				+ "\\\\\\\\Workspace\\\\\\\\testcases\\\\\\\\src\\\\\\\\data\\\\\\\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		if(file.getName().endsWith(".xlsx")) {
			workbook = new XSSFWorkbook();
			
		}else {
			workbook = new HSSFWorkbook(fis);
			
		}
		
		Sheet sheet= workbook.getSheet("Sheet1");
		for(int rowindex =sheet.getFirstRowNum();rowindex<sheet.getLastRowNum();rowindex++) {
		org.apache.poi.ss.usermodel.Row row =sheet.getRow(rowindex);
			
			
			for(int colindex=row.getFirstCellNum();colindex<row.getLastCellNum();colindex++) {
				
				Cell cell =sheet.getRow(rowindex).getCell(colindex);
				System.out.println(cell);
			}
		}
	}
	
	

}
