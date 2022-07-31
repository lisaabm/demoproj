package mavenproject.firstmaven;

import java.io.IOException;

public class ReadExcel3 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Excel3 ob= new Excel3();
		 String a=ob.readData(1,0);
		 System.out.println("Value of a is "+a);
	}


}
