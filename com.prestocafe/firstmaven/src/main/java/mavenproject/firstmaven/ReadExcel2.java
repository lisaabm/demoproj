package mavenproject.firstmaven;

import java.io.IOException;

public class ReadExcel2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Excel2 ob= new Excel2();
		 String a=ob.readData(0,0);
		 System.out.println("Value of a is "+a);
		 
		 String b=ob.readData(0,1);
		 System.out.println("Value of b is "+b);

	}


}
