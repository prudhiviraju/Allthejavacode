package com.automation.testData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.testng.annotations.Test;

import com.automation.selenium.utils.ApplicationConstants;

/* This example shows how to read data from flat file*/
class Example5 {

	@Test
	public void readTestDataFromFlatFile() {
		FileReader fileReader = null;
		BufferedReader reader = null;
		try {
			fileReader = new FileReader(new File(ApplicationConstants.TESTDATA_PATH + "TestData.txt"));
			reader = new BufferedReader(fileReader);
			String lineContent = reader.readLine();
			while (lineContent != null) {
				StringTokenizer tokenizer = new StringTokenizer(lineContent,"|");
				while (tokenizer.hasMoreTokens()) {
					System.out.println(tokenizer.nextToken());
				}
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

	}
}
