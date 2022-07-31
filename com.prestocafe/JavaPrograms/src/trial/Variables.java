package trial;

public class Variables 
{
	int d=20;
	static int c=90;

	public static void main(String[] args)
	{
		int a=50;
		
		System.out.println("Local Variable "+a);
		
		System.out.println("Static Variable "+c);
		
		Variables y=new Variables();
		System.out.println("Instance Variable "+y.d);
	}

}
