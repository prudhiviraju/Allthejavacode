package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public void Datadriven(String excelpath) throws Exception {
		

		try {
			File file = new File(excelpath);
			FileInputStream fis;
			fis = new FileInputStream(file);
			wb= new XSSFWorkbook(fis);
			 sheet =wb.getSheet("Sheet1");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		 
	}
	
	   public String getdata(String sheetname,int rownum,int col) {
		String data=sheet.getRow(rownum).getCell(col).getStringCellValue();
		return data;
	}

}
