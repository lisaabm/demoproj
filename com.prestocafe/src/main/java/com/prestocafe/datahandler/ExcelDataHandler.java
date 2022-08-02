package com.prestocafe.datahandler;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataHandler {
	
	public static final String currentDir  = System.getProperty("user.dir"); 
	public static String filePath = currentDir + "/src/main/resources/";
	
	FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\DEFI.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
	
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
}
	


