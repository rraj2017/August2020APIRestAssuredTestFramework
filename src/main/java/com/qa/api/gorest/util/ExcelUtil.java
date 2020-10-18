package com.qa.api.gorest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {
	public static Workbook book;
	public static Sheet sheet;
	public static String TESTDATA_SHEET_PATH = "C:/Users/RituRaj/JavaInterviewPrograms/Aug2020RestAssuredFramework/src/main/java/com/qa/api/gorest/testdata/GoRestTestData.xlsx";
	
	public static Object[][] getTestData(String sheetName) {
		try {
			//it(FileInputStream) is used to create a connection with any kind of file
			FileInputStream ip = new FileInputStream(TESTDATA_SHEET_PATH);
			//it(WorkbookFactory)will create a local copy inside the java memory
			book = WorkbookFactory.create(ip);
			//reach to the sheet
			sheet =	book.getSheet(sheetName);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int k =0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}

}
