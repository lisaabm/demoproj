package mavenproject.firstmaven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel4 {
static XSSFSheet sh;
	
	public static String readData(int i, int j) {
		Row r= sh.getRow(i);
		Cell c= r.getCell(j); //Import Cell of apache poi not Table 
		int celltype=c.getCellType();//string : if string then returns ' 1' . //numeric: if numeric  then returns ' 0' . 
		
		switch(celltype)  { 
		case Cell.CELL_TYPE_NUMERIC:
		{ 
			double a=c.getNumericCellValue(); 
			return String.valueOf(a); 
			} 
		case Cell.CELL_TYPE_STRING:
        {
        	return c.getStringCellValue(); 
           }  
       } 
		return null; } 
public Excel4() throws IOException 
{ 
	FileInputStream f= new FileInputStream("C:\\Users\\lisaa\\Desktop\\testmaven.xlsx");
	XSSFWorkbook w= new XSSFWorkbook(f); 
	sh= w.getSheet("Sheet1");
	}


}
