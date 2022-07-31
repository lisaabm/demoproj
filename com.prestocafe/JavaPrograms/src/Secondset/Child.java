package Secondset;

public class Child extends Parent{
	public void getChild()
	{
		System.out.println("This is inside child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child b=new Child();
		b.getParent();
		b.getChild();

	}

}
