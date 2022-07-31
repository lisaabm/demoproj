package firstset;

public class Methods {
	public void instMethod()
	{
		System.out.println("This is inside instance method");
		//instMethod2();
	}
	
	public void instMethod2()
	{
		System.out.println("This is inside inst method 2");
		instMethod();
		statMethod();
	}
	
	public static void statMethod()
	{
		System.out.println("This is inside static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods i=new Methods();
		i.instMethod2();
		statMethod();

	}

}
