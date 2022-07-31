package mavenproject.firstmaven;

import java.io.IOException;

public class ReadExcel4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Excel4 ob= new Excel4();
		 String a=ob.readData(1,0);
		 System.out.println("Value of a is "+a);
		 
		 String b=ob.readData(1,1);
		 System.out.println("Value of b is "+b);

	}


}
