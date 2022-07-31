package mavenproject.firstmaven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 
{
	XSSFSheet sh;
	public String readData(int i, int j)
	{
		Row r= sh.getRow(i);
		Cell c= r.getCell(j);
		double a=c.getNumericCellValue(); 
		return String.valueOf(a); 
	}
	public Excel1()throws IOException
	
	{
		FileInputStream f= new FileInputStream("C:\\Users\\lisaa\\Desktop\\testmaven.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f); 
		sh= w.getSheet("Sheet1");
    }


}
