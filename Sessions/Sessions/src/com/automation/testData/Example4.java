package com.automation.testData;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to create xls or xlsx file by using Apache POI*/
class Example4 {

	@Test
	public void readTestData() {
		Workbook workBook = null;
		Sheet sheet = null;
		Row row = null;
		String testDataFile = ApplicationConstants.TESTDATA_PATH + "TestData.xlsx";;
		try {
			if(testDataFile.endsWith(".xlsx")){
				workBook = new XSSFWorkbook();
			}else if(testDataFile.endsWith(".xls")){
				workBook = new HSSFWorkbook();
			}
			sheet = workBook.createSheet("TestData");
			row = sheet.createRow(0);
			row.createCell(0).setCellValue("TestScriptName");
			row.createCell(1).setCellValue("FirstName");
			row.createCell(2).setCellValue("LastName");
			row.createCell(3).setCellValue("MiddleName");
			row = sheet.createRow(1);
			row.createCell(0).setCellValue("Example4");
			row.createCell(1).setCellValue("SCOTT");
			row.createCell(2).setCellValue("TIGER");
			row.createCell(3).setCellValue("JOHN");
			workBook.write(new FileOutputStream(testDataFile));
			System.out.println("Sucessfully created TestData file location:"+testDataFile);
		} catch (Exception exception) {
			System.out.println(exception.getStackTrace());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}

	}
}
