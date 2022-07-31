package worksheet;
//36. Program to check the addition result is divisible by 10
// Class 1
//Return addition result of two numbers
// Class 2
//Check the addition result is divisible by 10(use super keyword)

public class AdditionClass2 extends AdditionClass1 {
	public AdditionClass2()
	{
		super();
		if(sum/10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not Divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionClass2 o=new AdditionClass2();
		

	}

}
