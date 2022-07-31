package Secondset;

public class B extends A {
	public void getB()
	{
		System.out.println("This is inside class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B j=new B();
		j.getA();
		j.getB();
	}

}
