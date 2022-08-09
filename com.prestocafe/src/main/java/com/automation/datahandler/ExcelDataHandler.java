package com.automation.datahandler;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataHandler {
	
	public static final String currentDir  = System.getProperty("user.dir"); 
	public static String filePath = currentDir + "/src/main/resources/";
	static XSSFWorkbook workbook; 
	static XSSFSheet sheet;
	
	public ExcelDataHandler(String fileName, String sheetName)throws IOException {
		String excelPath = filePath+fileName;
	    workbook = new XSSFWorkbook(excelPath);
	    sheet = (XSSFSheet) workbook.getSheetAt(0);
	}
	
	public void getCellData() {
	Iterator <Row> rowIterator = sheet.rowIterator();
	while(rowIterator.hasNext()) {
		Row row = rowIterator.next();
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			// Read cell data
		}
	}
	}
	/**
	 * method to get rowsCount
	 */
	public static int getRowCount() {
		int rowCount = 0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
	
	/**
	 * method to get columnCount
	 */
	public static int getColCount() {
		int colCount = 0;
		try {
			colCount = sheet.getRow(0).getLastCellNum();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}
	
	/**
	 * method to get cell data (String)
	 */
	public String getCellDataString(int rowNum, int colNum) {
		String cellValue = null;
		try {
			cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cellValue;
	}
	
}

	


