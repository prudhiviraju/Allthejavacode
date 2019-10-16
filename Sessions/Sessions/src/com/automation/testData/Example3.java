package com.automation.testData;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to read data from XLS  and XLSX*/
class Example3 {

	@Test
	public void readTestData() {
		int numberOfRows;
		int numberOfColumns;
		Workbook workBook = null;
		Sheet sheet = null;
		Row row = null;
		String testDataFile = ApplicationConstants.TestData_XLSX;
		try {
			if(testDataFile.endsWith(".xlsx")){
				workBook = new XSSFWorkbook(new FileInputStream(ApplicationConstants.TestData_XLSX));
			}else if(testDataFile.endsWith(".xls")){
				workBook = new HSSFWorkbook(new FileInputStream(ApplicationConstants.TESTDATA_XLS));
			}
			
			sheet = workBook.getSheet("PanOnline");
			numberOfRows = sheet.getPhysicalNumberOfRows();
			System.out.println("NumberOfRows:" + numberOfRows);
			for (int rowIndex = 0; rowIndex < numberOfRows; rowIndex++) {
				row = sheet.getRow(rowIndex);
				numberOfColumns = row.getPhysicalNumberOfCells();
				System.out.println("NumberOfColumns:" + numberOfColumns);
				for (int column = 0; column < numberOfColumns; column++) {
					System.out.print(row.getCell(column).toString() + "\t");
				}
				System.out.println();
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				workBook.close();
			} catch (Exception exception) {
				System.out.println(exception.getMessage());
			}

		}

	}
}
