package mavenproject.firstmaven;

import java.io.IOException;

public class ReadExcel1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Excel1 ob= new Excel1();
		 String a=ob.readData(0,0);
		 System.out.println("Value of a is "+a);
	}


}
