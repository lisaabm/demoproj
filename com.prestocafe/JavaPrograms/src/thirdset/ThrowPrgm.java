package thirdset;

public class ThrowPrgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float balance=1000f;
		float withdraw=200f;
		try{
			if(withdraw>balance)
			{
				throw new ArithmeticException();
			}
		}
		catch(Exception e){
			System.out.println("Excecuted");
		}
		finally{
			System.out.println("Exception handled");
		}

	}

}
