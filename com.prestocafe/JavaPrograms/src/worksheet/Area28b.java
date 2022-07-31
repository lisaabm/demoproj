package worksheet;

public class Area28b {
	public static void getArea(float a )
	{
		float a1=(float) (3.14*a*a);
		System.out.println("Area of Circle= "+a1);
	}
	public static void getArea(int a,int b)
	{
		int a2=a*b;
		System.out.println("Area of Rectangle= "+a2);
	}
	public static void getArea(int a)
	{
		int a3=a*a;
		System.out.println("Area of Square= "+a3);
	}
	public static void main(String[] args) {
		getArea(10f);
		getArea(7,8);
		getArea(4);
	}
}
