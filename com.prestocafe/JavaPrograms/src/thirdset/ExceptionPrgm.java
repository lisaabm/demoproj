package thirdset;

public class ExceptionPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=100/0;
			System.out.println(a);
		}
		
	catch(ArithmeticException e){
		System.out.println("this is arithmetic exception");
	}
		finally{
			System.out.println("this is Finally block");
		}

	}

}
