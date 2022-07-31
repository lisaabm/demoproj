package worksheet;

public class Avg28a {
	static float sum;
	static float avga;
	static float avgb;
	public static void getAverage(int a,int b,int c)
	{
		sum=a+b+c;
		avga=sum/3;
		System.out.println("Average of Integers= "+ avga);
	}
	public static void getAverage(float x,float y,float z)
	{
		sum=x+y+z;
		avgb=sum/3;
		System.out.println("Average of float numbers= "+avgb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverage(60,80,60);
		getAverage(5.5f,6.9f,4.5f);
	}
}
