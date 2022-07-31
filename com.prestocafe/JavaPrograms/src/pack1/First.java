package pack1;

public class First 
{
	private int a=10;
	public int b=20;
	protected int c=30;
	int d=50;
	private void getmethod1()
	{
		System.out.println("Private method");
	}
	
	void getmethod2()
	{
		System.out.println("default method");
	}
	public void getmethod3()
	{
		System.out.println("public method");
	
	}
	protected void getmethod4()
	{
		System.out.println("protected method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		f.getmethod1();
		System.out.println(f.a);
		
		f.getmethod2();
		System.out.println(f.b);
		f.getmethod3();
		System.out.println(f.c);
		f.getmethod4();
		System.out.println(f.d);
	}
}

