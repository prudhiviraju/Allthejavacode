package com.automation.testData;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to read data from flat file and how to use in testscript*/
class Example6 {

	private WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",ApplicationConstants.CHROME_DRIVER);
		driver = new ChromeDriver();
	}

	@Test
	public void loginAndVerifyTitle() {
		String userName= null;
		String password = null;
		ArrayList<ArrayList<String>> testData = readTestDataFromFlatFile();
		for (int index = 1; index < testData.size(); index++) {
			userName = testData.get(index).get(1).toString();
			password = testData.get(index).get(2).toString();
			String expectedTitle = "Find a Flight: Mercury Tours:";
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.name("userName")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			String actualTitle = driver.getTitle().trim();
			if (actualTitle.equals(expectedTitle)) {
				System.out.println("Actual Title is same as Expected Title");
			} else {
				System.out.println("Actual Title is not same as Expected Title");
			}

		}

	}

	public ArrayList<ArrayList<String>> readTestDataFromFlatFile() {
		FileReader fileReader = null;
		BufferedReader reader = null;
		ArrayList<ArrayList<String>> rowData = null;
		ArrayList<String> columnsData = null;
		try {
			fileReader = new FileReader(new File(ApplicationConstants.TESTDATA_PATH + "TestData.txt"));
			reader = new BufferedReader(fileReader);
			String lineContent = reader.readLine();
			rowData = new ArrayList<ArrayList<String>>();
			while (lineContent != null) {
				StringTokenizer tokenizer = new StringTokenizer(lineContent,"|");
				columnsData = new ArrayList<String>();
				while (tokenizer.hasMoreTokens()) {
					columnsData.add(tokenizer.nextToken());
				}
				rowData.add(columnsData);
				lineContent = reader.readLine();
			}
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			try {
				fileReader.close();
				reader.close();
			} catch (IOException ioException) {
				System.out.println(ioException.getMessage());
			}
		}
		return rowData;
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
