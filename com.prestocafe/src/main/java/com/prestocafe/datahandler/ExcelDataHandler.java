package com.prestocafe.datahandler;

import java.io.FileInputStream;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataHandler {
	
	public static final String currentDir  = System.getProperty("user.dir"); 
	public static String filePath = currentDir + "/src/main/resources/";
	
	FileInputStream fs = new FileInputStream("C:\\Users\\HP\\Desktop\\DEFI.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
	
	Iterator <Row> rowIterator = sheet.iterator();
	
	while(rowIterator.hasNext()) {
		Row rowValue = rowIterator.next();
		
		Iterator <Cell> column = rowValue.iterator();
		while(column.hasNext()) {
			Cell cellvalue = column.next();	
			System.out.println(cellvalue);
		}
	}


}
