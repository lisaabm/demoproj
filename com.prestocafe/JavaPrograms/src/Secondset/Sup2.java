package Secondset;

public class Sup2 extends Sup1{
	String color="Black";
	
	public void print()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup2 p=new Sup2();
		p.print();

	}

}
