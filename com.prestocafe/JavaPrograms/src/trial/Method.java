package trial;

public class Method {
	public int addition(int a,int b)
	{
		int sum=a+b;
		//System.out.println(sum);
		return sum;
	}
	
	public static int substraction(int c,int d)
	{
		int difference=c-d;
		//System.out.println(difference);
		return difference;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m=new Method();
		
		int totalsum=m.addition(7, 9);
		System.out.println(totalsum);
	    int diff=substraction(10,4);
	    System.out.println(diff);

	}

}
