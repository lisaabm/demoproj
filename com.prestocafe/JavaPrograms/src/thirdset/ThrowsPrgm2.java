package thirdset;

public class ThrowsPrgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ThrowsPrgm2 b=new ThrowsPrgm2();
	        b.print1();
	  }
	   public void print1()
	   {
		   print2();
	   }
	   public void print2()
	   {
		   try {
			   print3();
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("Handled Exception");
		   }
	   }
	   public void print3()
	   {
		   throw new ArithmeticException("throws exception");
	   }



	}

