package trial;

public class MethodOverloading
{
	public static void main(String[] args) 
	{
		MethodOverloading.getProduct(20,30);
		MethodOverloading.getProduct(10,10,90);
	}
	
	public static void getProduct(int a,int b,int c)
	{
		int d;
		d=a*b*c;
		System.out.println("Product "+d);
	}
	
	public static void getProduct(int a,int b)
	{
		int d;
		d=a*b;
		System.out.println("Product "+d);
	}
}
